//while 
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;

}
console.log("Fin del ciclow while");

//do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++; 
}while(conteo < 3);
console.log("Fin del ciclo do while");

//for
for( let contando=0; contando < 3 ;contando++){
    console.log(contando);
}
console.log("Fin del ciclo for");

//Palabra reservada break
for(let contando = 0; contando <= 10 ; contando++){
    if(contando% 2 == 0){
        console.log(contando);//Muestra todos los pares
    }
    
}
console.log("Termina contand el ciclo al encontrar el primer numero los pares");

//La palabara continue //Etiquetas Labels
inicio:
for(let contando = 0; contando <= 10 ; contando++){
    if(contando% 2 !== 0){
        continue inicio;//Esto va a continuar a la siguiente interaccion 
    } 
    console.log(contando);
    
}
console.log("Termina el ciclo ");   



