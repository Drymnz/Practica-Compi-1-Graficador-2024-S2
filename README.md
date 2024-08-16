# GrammarGeomCalc 
## Practica de Compi - 2024 S2

<img src='/recursos-git/Screenshot_Proyect.png'>

Desarrolla aplicaciones gráficas personalizadas con nuestro framework basado en Java Swing. La herramienta te permite definir un figuras geometricas basica mediante el lenguaje formal ya programado.

* ## Requerimientos del sistema:
* Sistemas Operativos Compatibles:
    * Linux : Cual quier sistema que soporte JAVA.
    * Microsoft Windows: Windows 7, Windows XP, Windows Vista (Windows XP Professional SP3/Vista SP1/Windows 7 Professional).

* Procesador: Intel Pentium III 800 MHz o superior.

* RAM: 512 MB.

* Espacio en Disco: 10 MB.

* ## Instalación y configuración:
* #### git
    Se requiere instalar git para poder clonar el repo.

    La siguiten instruccion es unicamentes para instalar en arch linux o derivadas.

    ```
    sudo pacman -Syu git
    ```

* #### JAVA
    Se requiere instalar java para su ejecucion.

    La siguiten instruccion es unicamentes para instalar en arch linux o derivadas.

    ```
    sudo pacman -Syu jdk21-openjdk
    ```

# Instalación De Uso

En la parte izquierda el programa acepta el ingreso de los siguientes instrucciones.

## Círculo
Para graficar un círculo se usa la instrucción:

```
    graficar circulo (<nombre>, <posx>, <posy>, <radio>, <color>)
```
Ejemplo :

```
    graficar circulo (figura_1, 25 + 12, 25, 15/3, rojo)
```

## Cuadrados
Para graficar un cuadrado se usa la instrucción:

```
    graficar cuadrado (<nombre>, <posx>, <posy>, <tamaño lado>, <color>)
```
Ejemplo :

```
    graficar cuadrado ( figura_cuadrada, 12*3, 15+1, (15-3) / 4, verde)
```

## Rectángulo
Para graficar un rectángulo se usa la instrucción:

```
    graficar rectangulo (<nombre>, <posx>, <posy>, <ancho>, <alto>, <color>)
```
Ejemplo :

```
    graficar rectangulo (rectangulo_12, 12 * 3 + 2, 15, 4 / 4, negro)
```

## Línea
Para graficar un linea se usa la instrucción:

```
    graficar linea (<nombre>, <posx1>, <posy1>, <posx2>, <posy2>, <color>)
```
Ejemplo :

```
    graficar linea (linea_Amarillo, 12 * 3 + 2, 15, 4 / 4, 50 * 1, amarillo)
```

## Polígono
Para graficar un poligono de n lados se usa la instrucción:

```
    graficar poligono (<nombre>, <posx>, <posy>, <cantidad lados>, <ancho>, <alto>,<color>)
```
Ejemplo :

```
    graficar poligono ( PoligA, 12 + 2, 15, 6, 50 / 2, 12, amarillo)
```

## Animar
 Esta instrucción aplica al objeto
indicado en la línea inmediatamente anterior de la instrucción de animación. Si no hay
ninguna instrucción de dibujo antes de la instrucción de animación entonces esta no se
ejecuta.

```
    animar objeto anterior (<tipoanimacion>,<destinox>, <destinoy>, <orden>)
```
Ejemplo :

```
    animar objeto anterior (curva, 50*3, 75+5, 1+1)
```

Con el botón animar puede decidir si ejecuta las animaciones detectadas.


# Analizador Lexico
| Nombre | Descipcion |
| --------- | --------- |
| \<nombre> |Es el identificador del objeto a graficar el cual puede contener todo el alfabeto \[a-zA-Z] mayúsculas y minúsculas, así como también números y guiones bajos. |
| \<posx> \<posy> \<radio> \<ancho> \<alto> \<posx2> \<posy2>\<destinox> \<destinoy> \<cantidad lados>|Es el lengua de un numero entero o decimal.Tambien acepta la secuencia de operadores aritmeticos simples como SUMA,RESTA,DIVISION Y MULTIPLICACION, como la jerarquia de operacion con PARENTESIS dando el resultado en entero. | 
| \<color> | Permite el siguiente listado de colores:   azul , rojo , amarillo , verde , negro , celeste , fucsia , lavanda , corinto  |
|\<tipoanimacion>| Es el tipo de animacion. Linea: Sera una trayectoria de translacion linea. Curva: Sera una trayectoria de translacion linea y de rotacion. |


  
