ForoHub - Challenge Alura

¿Qué es ForoHub? Es un sistema de Foro desarrollado con Java y Spring Boot.
El objetivo principal es gestionar tópicos (preguntas o temas de discusión) de una manera organizada y eficiente.

¿Qué hace esta API?
Permite interactuar con los mensajes del foro. Estas son las acciones que se pueden realizar:

    -Crear un tópico: Puedes publicar nuevas dudas o temas.
    -Listar todo: Mira todos los mensajes publicados con un formato ordenado y paginado.
    -Ver detalle: Si te interesa un tema en específico, puedes consultarlo por su ID.
    -Editar: ¿Te equivocaste en el título o mensaje? Puedes actualizarlo fácilmente.
    -Eliminar: Si un tema ya no es relevante, puedes borrarlo de la base de datos.
    -Autenticar: Con un Sistema de Login que genera tokens JWT para proteger tus datos.

Herramientas Utilizadas:

    -Java 17 y Spring Boot 3.
    -MySQL para guardar toda la información.
    -Flyway para que las tablas se creen solas al iniciar el proyecto.
    -Maven para manejar las librerías.
    -Postman para probar que cada ruta funcione perfectamente.
    -Spring Security para controlar quién entra y qué puede hacer cada usuario.
    -Java JWT (Auth0), librería generar y verificar que los tokens sean reales

Para probarlo debes:

    -Clonar este repositorio.
    -Asegurarte de tener una base de datos en MySQL llamada forohub_db.
    -Cambiar el usuario y contraseña en el archivo application.properties.
    -Clickear "Run" en tu IDE (Ej: IntelliJ).
    -Realizar un POST a /login para obtener tu Token JWT y colócalo en el encabezado de autorización de Postman.

