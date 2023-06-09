class Persona{ //Clase padre

    static contadorPersonas = 0; //Atributo estatico
    //email = 'Valor default email'; //Atributo no estatico

    static get MAX_OBJ(){ //Este metodo simula una constante
        return 5
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        } else {
            console.log("Se ha superado el maximo de Objetos permitidos");
        }

        //console.log('Se incremento el contador: ' +Persona.contadorObjetosPersona);
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido() {
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona+' '+this.nombre+" "+this.apellido
    }

    toString(){
        return this.nombreCompleto()
    }

    static saludar(){
        console.log("Saludos desde este metodo static");
    }

    static saludar2(persona){
        console.log(persona.nombre+' '+persona.apellido);
    }
}

class Empleado extends Persona{ //Clase Hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento() {
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    //SOBRESCRIBIR METODO nombreCompleto
    nombreCompleto(){
        return super.nombreCompleto()+', '+this._departamento;
    }
}

let persona1 = new Persona('Martin', 'Perez');
//console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1);
console.log(persona1.apellido);
persona1.apellido = "Rodriguez";
console.log(persona1.apellido);

let persona2 = new Persona('Carlos', 'Maslaton');
//console.log(persona2);
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2);
console.log(persona2.apellido);
persona2.apellido = "Juarez";
console.log(persona2.apellido);


let empleado1 = new Empleado("Francisco", "Tonidandel", "ATP");
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar() los metodos static no se pueden utilziar desde los objetos
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No se puede acceder desde la Clase

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);

let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
Persona.MAX_OBJ = 10; //Al ser constante no podemos modificarlo

let persona4 = new Persona('Franco', 'Diaz');
console.log(persona4.toString());

let persona5 = new Persona('Liliana', 'Bilan')
console.log(persona5.toString());