// mascotasDB.js - Sistema de gestión de mascotas con simulación de base de datos

// Base de datos simulada de mascotas
const mascotasDB = [
    {
        id: 1,
        nombre: "Max",
        tipo: "Labrador Negro",
        genero: "Macho",
        edad: 1,
        imagen: "imagen/Labrador negro.jpg",
        descripcion: "Labrador negro muy juguetón y cariñoso",
        adoptado: false
    },
    {
        id: 2,
        nombre: "Michi",
        tipo: "Gatico",
        genero: "Macho",
        edad: 2,
        imagen: "imagen/gatico.jpg",
        descripcion: "Gatito tierno y muy curioso",
        adoptado: false
    },
    {
        id: 3,
        nombre: "Luna",
        tipo: "Gato",
        genero: "Hembra",
        edad: 3,
        imagen: "imagen/gato.jpg",
        descripcion: "Gata independiente pero muy cariñosa",
        adoptado: false
    },
    {
        id: 4,
        nombre: "Rocky",
        tipo: "Labrador Negro",
        genero: "Macho",
        edad: 2,
        imagen: "imagen/Labrador negro.jpg",
        descripcion: "Perro enérgico ideal para familias activas",
        adoptado: false
    },
    {
        id: 5,
        nombre: "Pelusa",
        tipo: "Gatico",
        genero: "Hembra",
        edad: 1,
        imagen: "imagen/gatico.jpg",
        descripcion: "Gatita juguetona que adora las caricias",
        adoptado: false
    },
    {
        id: 6,
        nombre: "Simba",
        tipo: "Gato",
        genero: "Macho",
        edad: 4,
        imagen: "imagen/gato.jpg",
        descripcion: "Gato tranquilo perfecto para departamentos",
        adoptado: false
    },
    {
        id: 7,
        nombre: "Buddy",
        tipo: "Labrador Negro",
        genero: "Macho",
        edad: 3,
        imagen: "imagen/Labrador negro.jpg",
        descripcion: "Compañero leal y excelente con niños",
        adoptado: false
    },
    {
        id: 8,
        nombre: "Nala",
        tipo: "Gatico",
        genero: "Hembra",
        edad: 2,
        imagen: "imagen/gatico.jpg",
        descripcion: "Gatita elegante y muy limpia",
        adoptado: false
    },
    {
        id: 9,
        nombre: "Garfield",
        tipo: "Gato",
        genero: "Macho",
        edad: 5,
        imagen: "imagen/gato.jpg",
        descripcion: "Gato relajado que adora dormir",
        adoptado: false
    }
];

// Función para obtener todas las mascotas
function obtenerMascotas() {
    return mascotasDB;
}

// Función para obtener mascotas disponibles (no adoptadas)
function obtenerMascotasDisponibles() {
    return mascotasDB.filter(mascota => !mascota.adoptado);
}

// Función para cargar mascotas en la página
function cargarMascotasEnPagina() {
    const contenedor = document.querySelector('.row.g-4');
    if (!contenedor) return;

    contenedor.innerHTML = ''; // Limpiar contenedor

    const mascotas = obtenerMascotasDisponibles();

    mascotas.forEach(mascota => {
        const iconoGenero = mascota.genero === 'Macho' 
            ? '<i class="fas fa-mars text-primary"></i>' 
            : '<i class="fas fa-venus text-danger"></i>';

        const tarjetaMascota = `
            <div class="col-lg-4 col-md-6 col-sm-12">
                <div class="card mascota-card h-100 shadow-sm">
                    <img src="${mascota.imagen}" class="card-img-top" alt="${mascota.tipo}">
                    <div class="card-body text-center">
                        <h5 class="card-title">${mascota.nombre}</h5>
                        <p class="text-muted mb-2">${mascota.tipo}</p>
                        <p class="card-text">
                            ${iconoGenero} <strong>${mascota.genero}</strong><br>
                            <i class="fas fa-birthday-cake text-info"></i> <strong>${mascota.edad} año(s)</strong>
                        </p>
                        <p class="small text-muted">${mascota.descripcion}</p>
                        <button class="btn btn-primary btn-sm" onclick="mostrarInteres(${mascota.id})">
                            <i class="fas fa-heart"></i> Me interesa
                        </button>
                    </div>
                </div>
            </div>
        `;

        contenedor.innerHTML += tarjetaMascota;
    });
}

// Función cuando alguien muestra interés en una mascota
function mostrarInteres(id) {
    const mascota = mascotasDB.find(m => m.id === id);
    if (mascota) {
        alert(`¡Gracias por tu interés en ${mascota.nombre}!\n\nPor favor visita nuestra sección de Contacto para coordinar una visita.`);
        // Redirigir a la página de contacto
        setTimeout(() => {
            window.location.href = 'contacto.html';
        }, 2000);
    }
}

// Función para buscar mascotas por tipo
function buscarPorTipo(tipo) {
    return mascotasDB.filter(mascota => 
        mascota.tipo.toLowerCase().includes(tipo.toLowerCase()) && !mascota.adoptado
    );
}

// Función para buscar mascotas por género
function buscarPorGenero(genero) {
    return mascotasDB.filter(mascota => 
        mascota.genero.toLowerCase() === genero.toLowerCase() && !mascota.adoptado
    );
}

// Función para buscar mascotas por edad
function buscarPorEdad(edadMin, edadMax) {
    return mascotasDB.filter(mascota => 
        mascota.edad >= edadMin && mascota.edad <= edadMax && !mascota.adoptado
    );
}

// Cargar mascotas cuando el DOM esté listo
document.addEventListener('DOMContentLoaded', function() {
    // Verificar si estamos en la página de mascotas
    if (window.location.pathname.includes('mascota.html')) {
        cargarMascotasEnPagina();
    }
});

// Exportar funciones para uso global
window.obtenerMascotas = obtenerMascotas;
window.obtenerMascotasDisponibles = obtenerMascotasDisponibles;
window.mostrarInteres = mostrarInteres;
window.buscarPorTipo = buscarPorTipo;
window.buscarPorGenero = buscarPorGenero;
window.buscarPorEdad = buscarPorEdad;