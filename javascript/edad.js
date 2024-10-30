let fecha = parseInt(prompt("Digite el año de nacimiento"));
let actual = 2024;

let edad = actual - fecha;

if (edad >= 18){
    alert ("Es mayor de edad y su edad es: "+edad);
}else{
    alert ("Es menor de edad y su edad es: "+edad);
}

