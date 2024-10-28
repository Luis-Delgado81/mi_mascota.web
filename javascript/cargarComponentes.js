// Función para cargar contenido externo
function cargarComponente(ruta, elementoID) {
    fetch(ruta)
        .then(response => response.text())
        .then(data => {
            document.getElementById(elementoID).innerHTML = data;
        })
        .catch(error => console.error('Error al cargar el componente:', error));
}

// Cargar el header y footer cuando se cargue la página
document.addEventListener("DOMContentLoaded", function() {
    cargarComponente('header.html', 'header');
    cargarComponente('footer.html', 'footer');
});
