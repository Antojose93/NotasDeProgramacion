**Cuándo hacerlo:** antes del martes 31 de diciembre de 2024 a las 11:59 p. m. GMT-5

**Cómo obtener ayuda:** ¡Haz preguntas a través de Ed! ¡Haz preguntas a través de cualquiera de las comunidades de CS50!

**Antecedentes:** Según el juego Six Degrees of Kevin Bacon, cualquier persona en la industria cinematográfica de Hollywood puede estar conectada a Kevin Bacon en seis pasos, donde cada paso consiste en encontrar una película en la que ambos actores hayan protagonizado.

En este problema, nos interesa encontrar el camino más corto entre dos actores eligiendo una secuencia de películas que los conecte. Por ejemplo, el camino más corto entre Jennifer Lawrence y Tom Hanks es 2: Jennifer Lawrence está conectada a Kevin Bacon por haber protagonizado "X-Men: Primera generación", y Kevin Bacon está conectado a Tom Hanks por haber protagonizado "Apolo 13".

Podemos plantear esto como un problema de búsqueda: nuestros estados son personas. Nuestras acciones son películas, que nos llevan de un actor a otro (es cierto que una película podría llevarnos a varios actores diferentes, pero eso está bien para este problema). Nuestro estado inicial y estado objetivo están definidos por las dos personas que estamos tratando de conectar. Al utilizar la búsqueda en amplitud, podemos encontrar el camino más corto de un actor a otro.

**Para empezar:**



1. Descarga el código de distribución desde[ aquí](https://cdn.cs50.net/ai/2023/x/projects/0/degrees.zip) y descomprímelo.

**Comprensión:** El código de distribución contiene dos conjuntos de archivos CSV: uno en el directorio `large` y otro en el directorio `small`. Cada uno contiene archivos con los mismos nombres y la misma estructura, pero `small` es un conjunto de datos mucho más pequeño para facilitar las pruebas y experimentaciones.

Cada conjunto de datos consiste en tres archivos CSV. Un archivo CSV, si no estás familiarizado, es simplemente una forma de organizar datos en un formato basado en texto: cada fila corresponde a una entrada de datos, con comas en la fila separando los valores para esa entrada.



1. Abre `small/people.csv`. Verás que cada persona tiene un id único, correspondiente con su id en la base de datos de IMDb. También tienen un nombre y un año de nacimiento.
2. A continuación, abre `small/movies.csv`. Verás que cada película también tiene un id único, además de un título y el año en que se estrenó la película.
3. Ahora, abre `small/stars.csv`. Este archivo establece una relación entre las personas en `people.csv` y las películas en `movies.csv`.

**Echa un vistazo a <code>degrees.py</code>:</strong> En la parte superior, se definen varias estructuras de datos para almacenar información de los archivos CSV.



* El diccionario `names` es una forma de buscar una persona por su nombre.
* El diccionario `people` mapea el id de cada persona a otro diccionario con valores para el nombre de la persona, el año de nacimiento y el conjunto de todas las películas en las que han protagonizado.
* El diccionario `movies` mapea el id de cada película a otro diccionario con valores para el título de la película, el año de lanzamiento y el conjunto de todas las estrellas de la película.

La función `load_data` carga los datos de los archivos CSV en estas estructuras de datos.

La función principal de este programa primero carga los datos en memoria. Luego, la función pide al usuario que escriba dos nombres. La función `person_id_for_name` obtiene el id de cualquier persona. Luego, la función llama a la función `shortest_path` para calcular el camino más corto entre las dos personas, e imprime el camino.

**Especificación:** Completa la implementación de la función `shortest_path` para que devuelva el camino más corto desde la persona con id `source` hasta la persona con id `target`.



* Si hay un camino desde la fuente hasta el objetivo, tu función debería devolver una lista, donde cada elemento de la lista es el siguiente par `(movie_id, person_id)` en el camino desde la fuente hasta el objetivo.
* Si hay varios caminos de longitud mínima desde la fuente hasta el objetivo, tu función puede devolver cualquiera de ellos.
* Si no hay un posible camino entre dos actores, tu función debería devolver `None`.

Puedes llamar a la función `neighbors_for_person`, que acepta el id de una persona como entrada y devuelve un conjunto de pares `(movie_id, person_id)` para todas las personas que protagonizaron una película con una persona dada.

**Pistas:**



* Puedes mejorar la eficiencia de tu búsqueda verificando si hay un nodo objetivo mientras se agregan nodos a la frontera.
* Puedes tomar y adaptar cualquier código de los ejemplos de la conferencia. Ya te hemos proporcionado un archivo `util.py` que contiene las implementaciones de la conferencia para `Node`, `StackFrontier` y `QueueFrontier`, que puedes usar (y modificar si lo deseas).