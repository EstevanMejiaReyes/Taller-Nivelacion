# Taller-Nivelacion
Taller Nivelación - Joan Estevan Mejia Reyes
# Taller de Nivelación PI a PII

Este documento contiene la parte *teórica* del taller, desarrollada en formato Markdown, y hace parte del repositorio junto con los ejercicios prácticos en Java.

---

## Parte Teórica

### 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?
Un *repositorio en Git* es una carpeta de proyecto que incluye un historial de versiones administrado por Git. La diferencia con un proyecto “normal” es que el repositorio guarda todos los cambios realizados (commits), permite volver a versiones anteriores y facilita la colaboración con otros.

### 2. Áreas principales de Git
- *Working directory*: Carpeta de trabajo donde editas archivos.
- *Staging area (index)*: Área temporal donde colocas los cambios que quieres confirmar.
- *Repository*: Lugar donde se almacenan los commits de forma permanente.

### 3. Representación interna de cambios en Git
Git guarda información como:
- *Blob*: Contenido de archivos.
- *Tree*: Estructura de directorios.
- *Commit*: Punto en el tiempo con cambios y metadatos.
- *Tag*: Etiqueta para marcar commits importantes.

### 4. Crear un commit y su información
1. Añadir cambios al staging:  
   ```bash
   git add archivo.java

### 5. Diferencia entre git pull y git fetch
- *git pull*: Descarga cambios remotos y los integra directamente en la rama actual.
- *git fetch*: Descarga cambios remotos, pero no los integra automáticamente; permite revisarlos antes.

### 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
Un branch es un puntero que referencia un commit específico. Git usa estos punteros para moverse por el historial de versiones y permite trabajar en varias líneas de desarrollo de forma independiente.

### 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
- Se realiza con el comando:
  ```bash
  git merge nombre-rama

### 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
El área de staging guarda los cambios que serán incluidos en el próximo commit.  
Si omites este paso, esos cambios no serán registrados cuando confirmes.

### 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
Es un archivo donde se especifican patrones de nombres de archivos o carpetas que Git debe ignorar, evitando que se suban al repositorio.

### 10. ¿Cuál es la diferencia entre un commit --amend y un nuevo commit?
- **--amend**: Modifica el último commit (mensaje o contenido).
- *Nuevo commit*: Crea un registro independiente en el historial.

### 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?
Guarda temporalmente cambios sin confirmar para limpiar el área de trabajo.  
Se usa cuando necesitas cambiar de rama o actualizar el proyecto sin perder lo que estabas haciendo.

### 12. ¿Qué mecanismos ofrece Git para deshacer cambios?
- **git reset**: Mueve la referencia de la rama y afecta el área de staging.
- **git revert**: Crea un commit inverso que revierte cambios previos.
- **git checkout**: Restaura archivos a su versión anterior o cambia de rama.

### 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
- *origin*: Repositorio remoto principal.
- *upstream*: Repositorio original del que se hizo un fork.
```bash
git remote add origin URL
git remote -v
```

### 14. ¿Cómo puedo inspeccionar el historial de commits?
Para revisar el historial y detalles de los commits en Git se pueden usar estos comandos:

- **git log**: Muestra la lista de commits con autor, fecha y mensaje.
- **git diff**: Compara los cambios entre commits o entre el estado actual y el último commit.
- **git show <id_commit>**: Muestra información detallada de un commit específico (cambios y metadatos).

Ejemplo:
```bash
git log
git diff
git show a1b2c3d
```
---

## *Sección 2: Programación en Java*

### 15. ¿Cuáles son los tipos de datos primitivos en Java?
En Java, los tipos de datos primitivos son:
- *byte* → Entero pequeño (8 bits), valores de -128 a 127.
- *short* → Entero corto (16 bits), valores de -32,768 a 32,767.
- *int* → Entero estándar (32 bits), valores de -2,147,483,648 a 2,147,483,647.
- *long* → Entero largo (64 bits), valores muy grandes.
- *float* → Número decimal de precisión simple (32 bits).
- *double* → Número decimal de precisión doble (64 bits).
- *char* → Un solo carácter Unicode (16 bits).
- *boolean* → Valores lógicos true o false.

### 16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?
- *if / else*: Ejecutan código condicionalmente según una condición booleana.
- *switch*: Evalúa una expresión y ejecuta el bloque de código del caso que coincida.
- *while*: Ejecuta un bloque de código mientras la condición sea verdadera.
- *do-while*: Igual que while, pero se ejecuta al menos una vez.
- *for*: Bucle con contador controlado, ideal para repeticiones definidas.

### 17. ¿Por qué es importante usar nombres significativos para variables y métodos?
Porque mejora la *legibilidad* del código, facilita su *mantenimiento* y reduce la posibilidad de errores.

### 18. ¿Qué es la Programación Orientada a Objetos (POO)?
Es un paradigma de programación que organiza el código en *clases* y *objetos*, permitiendo modelar entidades del mundo real y sus comportamientos.

### 19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
1. *Abstracción*: Mostrar solo los detalles esenciales de un objeto.
2. *Encapsulamiento*: Restringir el acceso directo a los datos internos de un objeto.
3. *Herencia*: Reutilizar atributos y métodos de otra clase.
4. *Polimorfismo*: Capacidad de un objeto para comportarse de diferentes maneras según el contexto.

### 20. ¿Qué es la herencia en POO y cómo se utiliza en Java?
La herencia permite que una clase herede atributos y métodos de otra.  
Ejemplo:
```java
class Hija extends Madre { }
```

### 21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
Los modificadores de acceso en Java definen el alcance o visibilidad de clases, atributos y métodos:

- *public* → Accesible desde cualquier parte del programa.
- *private* → Accesible solo dentro de la misma clase.
- *protected* → Accesible dentro del mismo paquete y en las subclases.
- *default* (sin palabra clave) → Accesible únicamente dentro del mismo paquete.

### 22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?
Una variable de entorno es un valor definido en el sistema operativo que puede ser utilizado por programas para su configuración y funcionamiento.

En Java, por ejemplo:
- **JAVA_HOME**: Indica la ruta de instalación del JDK.
- **PATH**: Incluye la carpeta bin de Java para poder ejecutar comandos como java o javac desde cualquier ubicación.

Son importantes porque:
- Facilitan la configuración del entorno de desarrollo.
- Permiten que el software encuentre recursos o herramientas necesarias sin rutas absolutas.
- Ayudan a mantener portabilidad y organización en el sistema.