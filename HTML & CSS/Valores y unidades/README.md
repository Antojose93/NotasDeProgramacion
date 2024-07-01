
#### Valores y Unidades

CSS utiliza varias unidades para medir y especificar valores. Las unidades más comunes incluyen:

**px (píxeles):** Unidad fija que representa un píxel en la pantalla. \



```
font-size: 16px;
```


**em:** Unidad relativa basada en el tamaño de fuente del elemento padre. 1em es igual al tamaño de la fuente actual.


```
font-size: 2em; /* 2 veces el tamaño de fuente del elemento padre */
```


**rem:** Unidad relativa basada en el tamaño de fuente del elemento raíz (generalmente el `&lt;html>`). \
 \



```
font-size: 1.5rem; /* 1.5 veces el tamaño de fuente del elemento raíz */
```


**% (porcentaje):** Unidad relativa basada en el tamaño del elemento contenedor. \
 \



```
width: 50%; /* 50% del ancho del elemento contenedor */
```


**vh y vw:** Unidades relativas a la altura (vh) y al ancho (vw) de la ventana gráfica (viewport). \
 \



```
height: 50vh; /* 50% de la altura de la ventana gráfica */
width: 50vw;  /* 50% del ancho de la ventana gráfica */
```


**unidades absolutas:** Además de `px`, hay otras unidades absolutas como `in` (pulgadas), `cm` (centímetros), y `mm` (milímetros). \



```
margin: 1in; /* 1 pulgada de margen */
```



#### Ejemplo Completo

Supongamos que tenemos el siguiente HTML:


```
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Document</title>
</head>
<body>
    <p class="texto">Este es un párrafo de ejemplo.</p>
    <div id="contenedor">
        <h1>Encabezado</h1>
    </div>
</body>
</html>
```


Y el siguiente CSS:


```
/* Selector de tipo (elemento) */
p {
    color: blue;          /* Texto azul */
    font-size: 16px;      /* Tamaño de fuente de 16 píxeles */
    margin: 20px;         /* Margen de 20 píxeles */
}

/* Selector de clase */
.texto {
    background-color: yellow; /* Fondo amarillo */
    padding: 10px;            /* Relleno de 10 píxeles */
}

/* Selector de ID */
#contenedor {
    width: 50%;               /* Ancho del 50% del contenedor */
    height: 100vh;            /* Altura del 100% de la ventana gráfica */
    border: 1px solid black;  /* Borde negro de 1 píxel de ancho */
}
```


En este ejemplo, aplicamos estilos a un párrafo, a un elemento con la clase `texto` y a un elemento con el ID `contenedor` utilizando diferentes propiedades y valores de CSS.
