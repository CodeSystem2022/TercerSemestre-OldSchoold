class PersonaDAO:
    """
    DAO significa =data access object
    CRUD= create=insertar,read=seleccionar,update=actualizar,delete=eliminar
    """
    _seleccionar = 'SELECT * FROM persona ORDER BY id_persona'
    _insertar = 'INSERT INTO persona(,nombre,apellido,email)VALUES(,%s,%s,%s)'
    _actualizar = 'UPDATE persona SET nombre = %s,apellido,email=%s,email=%s WHERE id_persona=%s'
    _eliminar = 'DELETE FROM persona WHERE id_persona= %s'
    
    # Definimos los metodos de clase
    @classmethod
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = []
                for registro in registros:
                    persona = Persona(registro[0], registro[1], registro[2], registro[3])
                    personas.append(persona)
                return personas

    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f'Persona Insertada: {persona}')
                return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                log.debug(f'Persona actualizada: {persona}')
                return cursor.rowcount

    @classmethod
    def eliminar(cls,persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.id_persona, )
                cursor.execute(cls._ELIMINAR, valores)
                log.debug(f'Se elimino correctamente el objeto: {persona}')
                return cursor.rowcount


if _name_ == '_main_':
    # Actualizar un registro
    #persona1 = Persona(1, nombre='Juan Jose', apellido='Pena', email='jjpena@gmail.com')
    #personas_actualizadas = PersonaDAO.actualizar(persona1)
    #log.debug(f'Personas actualizadas: {personas_actualizadas}')

    #Eliminar un registro
    # persona1=Persona(id_persona=9)
    # personas_eliminadas = PersonaDAO.eliminar(persona1)
    #log.debug(f'Personas eliminadas: {personas_eliminadas}')



     # Insertar un registro
     #persona1 = Persona(nombre='Pedro', apellido='Romero', email='promero@gmail.com')
     # personas_insertadas = PersonaDAO.insertar(persona1)
     #log.debug(f'Personas insertadas: {personas_insertadas}')

    # Seleccionar Objetos
      personas = PersonaDAO.seleccionar()
      for persona in personas:
          log.debug(persona)