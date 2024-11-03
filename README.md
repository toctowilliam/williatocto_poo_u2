# williatocto_poo_u2
Proyecto de POO de la Unidad 2
### OBJETIVO 
Este proyecto tiene como objetivo crear un sistema de gestión de contenidos audiovisuales en Java, implementando conceptos de Programación Orientada a Objetos (POO) como herencia, composición, y agregación. El sistema permite gestionar y visualizar información sobre diferentes tipos de contenidos, como películas, series de TV, documentales, videos de YouTube y telenovelas.

### Clases y Funcionalidades Nuevas
#### VideoYouTube:
    Subclase que representa un video de YouTube. Incluye el canal, el número de vistas y una lista de investigadores en caso de que haya colaboraciones con expertos. El método mostrarDetalles muestra información relevante del video, incluyendo los investigadores.

#### Telenovela: 
    Clase adicional que representa una telenovela, con una relación de agregación con Actor. Se incluyen métodos para agregar actores y visualizar los detalles del elenco.


### Instrucciones para Clonar y Ejecutar el Proyecto:
    Clonar el repositorio: Ejecuta el siguiente comando en la terminal para clonar el repositorio:
    git clone https://github.com/toctowilliam/williatocto_poo_u2

    Abrir el proyecto en un IDE: Importa el proyecto a tu entorno de desarrollo integrado (IDE) favorito, como Eclipse o IntelliJ IDEA.

    Ejecutar el programa: Navega hasta la clase PruebaAudioVisual y ejecuta el método main. Se mostrará información detallada sobre cada contenido audiovisual en la consola.
### Mejoras Adicionales

Optimización de Código: Los métodos mostrarDetalles en las subclases han sido optimizados para ofrecer una salida clara y detallada.
Escalabilidad: El diseño permite agregar fácilmente nuevas subclases de ContenidoAudiovisual para expandir el tipo de contenidos gestionados en el sistema.
