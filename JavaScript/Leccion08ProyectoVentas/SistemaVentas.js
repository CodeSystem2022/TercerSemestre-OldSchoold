class Producto{
    static contadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
    
    get precio(){
        return this._precio;
    }

    set precio(precio){
        this._precio = precio;
    }

    toString(){
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`
    }
} //FIN DE LA CLASE PRODUCTO

class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUTOS(){
        return 5
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos= [];
        this.contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUTOS()){
            this._productos.push(producto)
        } else {
            console.log('No se pueden agregar mas productos');
        }
    }

    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }
        return totalVenta;
    }

    mostrarOrden(){
        let productoOrden = ' ';
        for(let producto of this._productos){
            productoOrden += '\n{'+producto.toString()+' }';
        }
        console.log(`Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productoOrden}`);
    }
}//Fin clase Orden

let producto1 = new Producto('pantalon', 200);
let producto2 = new Producto('Camisa', 150);
let producto3 = new Producto('Cinturon', 50)
console.log(producto1.toString());
console.log(producto2.toString());

let orden1 = new Orden();
let orden2 = new Orden();

orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);

orden1.mostrarOrden();
orden2.mostrarOrden();