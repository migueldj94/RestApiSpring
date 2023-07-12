# RestApiSpring


# CONTENIDO

El Back  esta realizado en 

[Java](https://www.java.com/es/)

[Mongo DB](https://www.mongodb.com/es/)

## su estructura de archivos 
### Controllers
	UserController.java 

Se encarga de recibir las peticiones y ejecutar la lógica principal (llamado al servicio la mayoría de las veces)	

### Services
	UserService.java

Acciones permitidas en el sistema. Todo lo que se permite a quién lo solicita, por ejemplo: actualizar, buscar, operaciones de lógica, etc.

### Repositories
	UserRepository.java
Implica los métodos que llama el servicio. Tiene la lógica de conexión de persistencia, acciones de mapeo de objetos, métodos de operaciones de base de datos (consultas, etc).

### Models
	UserModel.java

Representación de una tabla/entidad/tipo/colección en una clase Java. Modelo de clase. 

________________________________________________________________________________________________________________________________________

## Framework

Spring boot 

Spring data

### Asistente de proyecto 

[intellij IDEA](https://www.jetbrains.com/idea/download/?section=windows)
__________________________________________________________________________________________________________________________________________
### Tener en cuenta 

1.	Recuerde tener instalado Java y en particular el JDK 8+.
2.	Puedes instalar IntelliJ IDEA directamente desde la web de Jetbrains, utilizando NNF (Next, Next, Finish), para cualquier SO (Windows, Linux, macOS). Recuerde que tiene dos opciones: versión community y ultimate (esta última se puede obtener en una licencia estudiantil). 
3.	En Windows también lo puedes hacer a través del gestor de paquetes chocolatey. En el powershell utilizando la línea de comando: choco install intellijidea-community. Para Linux, por ejemplo, dependiendo la distribución utilice su gestor de paquetes apt-get, yum, dnf, … Para macOS puede utilizar el gestor de paquetes Homebrew con la línea de comando: brew cask install intellij-idea-ce
______________________________________________________________________________________________________________________________________
### Programas Necesarios
Para poder utilizar el proyecto en localhost en necesario clonarlo y tener algunos programas necesarios:

IDE de desarrollo de tu comodidad Ej. [VS Code](https://code.visualstudio.com)

[POSMAN](https://www.postman.com) para puebas de APIS. (Opcional)

[git](https://github.com) para poder gestionar las versiones.


# Como Clonar

Comando para clonar:


git clone [LINK DEL REPOSITORIO]

### Como Ejecutar 

hacer  click sobre la clase principal y seleccione en la opción Run

![image](https://github.com/migueldj94/RestApiSpring/assets/125587415/9c26ff49-cad0-4d0b-9ab1-9ac02632f8df)


salida y  ejecución en la ventana inferior de IntelliJ IDEA:

![image](https://github.com/migueldj94/RestApiSpring/assets/125587415/c31da869-5353-4869-abff-5cef5fc38264)


