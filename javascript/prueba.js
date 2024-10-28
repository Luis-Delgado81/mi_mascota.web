var cnNotas = parseInt(prompt("Cantidad de notas: "));
var suma = 0;
/*var i = 1;
do{
    var notas = parseFloat(prompt("Escriba la nota: " + i));
    suma = suma + notas;
    i++;
}
while (i<=cnNotas);
var promedio = suma / cnNotas;
if  (promedio >= 3){
    alert ("usted gano y su nota es: "+ promedio);
}else if (promedio < 3){
    alert ("usted perdio y su nota es: "+ promedio);
}*/
for (var i = 1; i<=cnNotas; i++){
    var notas = parseFloat(prompt("Escriba la nota: "+i));
    var promedio = suma + notas;
}
if  (promedio >= 3){
    alert ("usted gano y su nota es: "+ promedio);
}else if (promedio < 3){
    alert ("usted perdio y su nota es: "+ promedio);
}