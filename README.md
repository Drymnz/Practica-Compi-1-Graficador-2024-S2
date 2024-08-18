# GrammarGeomCalc 
## Práctica de Compi - 2024 S2

<img src='/recursos-git/Screenshot_Proyect.png'>

**GrammarGeomCalc** Es una aplicación gráficas personalizadas con nuestro framework basado en Java Swing. La herramienta te permite definir un figuras geometricas básica mediante el lenguaje formal ya programado.

## Características

- **Interfaz amigable:** Desarrollada con Swing para ofrecer una experiencia de usuario sencilla y atractiva.
- **Graficación de figuras geométricas:** Permite dibujar figuras como círculos, rectángulos,etc.
- **Soporte para operaciones aritméticas:** Realiza cálculos matemáticos (suma, resta, multiplicación y división) sobre números enteros y decimales.
- **Interpretación de lenguaje formal:** Acepta un lenguaje formal específico para definir las operaciones y las figuras a graficar.

## Requisitos

- **Java 8 o superior**: Asegúrate de tener instalada la versión 8 o superior del JDK.
- **Biblioteca Swing**Swing está incluido en el JDK, por lo que no necesitas instalaciones adicionales.


### Requerimientos del sistema:
- **Sistemas Operativos Compatibles**: 
    * Linux : Cualquier sistema que soporte JAVA.
    * Microsoft Windows: Windows 7, Windows XP, Windows Vista (Windows XP Professional SP3/Vista SP1/Windows 7 Professional).

* Procesador: Intel Pentium III 800 MHz o superior.

* RAM: 512 MB.

* Espacio en Disco: 10 MB.

### Instalación y configuración:
* ### git
    Se requiere instalar git para poder clonar el repo.

    La siguiente instrucción es únicamente para instalar en arch linux o derivadas.

    ```bash
    sudo pacman -Syu git
    ```

* #### JAVA
    Se requiere instalar java para su ejecución.

    La siguiente instrucción es únicamente para instalar en arch linux o derivadas.

    ```bash
    sudo pacman -Syu jdk21-openjdk
    ```

* #### MAVEN
    Se requiere instalar maven para su ejecucion.

    La siguiente instrucción es únicamente para instalar en arch linux o derivadas.

    ```bash
    sudo pacman -Syu maven
    ```

    * #### Copilar
        Se requiere instalar maven para su ejecucion.

        La siguiente instrucción es únicamente para instalar en linux o derivadas.

        ```bash
        cd InterpreteFiguras
        ```

        ```bash
        cd Code
        ```

        ```bash
        mvn compile
        ```

        ```bash
        java -jar target/InterpreteFiguras-1.0-SNAPSHOT.jar
        ```

# Instalación De Uso

1. Al iniciar la aplicación, se presentará una ventana principal con opciones para graficar figuras geométricas.

2. Introduce las expresiones aritméticas y elige la figura geométrica que deseas graficar.

3. Haz clic en "Compilar" para visualizar la figura en el área de dibujo.

## Círculo
Para graficar un círculo se usa la instrucción:

```bash
    graficar circulo (<nombre>, <posx>, <posy>, <radio>, <color>)
```
Ejemplo :

```bash
    graficar circulo (figura_1, 25 + 12, 25, 15/3, rojo)
```

## Cuadrados
Para graficar un cuadrado se usa la instrucción:

```bash
    graficar cuadrado (<nombre>, <posx>, <posy>, <tamaño lado>, <color>)
```
Ejemplo :

```bash
    graficar cuadrado ( figura_cuadrada, 12*3, 15+1, (15-3) / 4, verde)
```

## Rectángulo
Para graficar un rectángulo se usa la instrucción:

```bash
    graficar rectangulo (<nombre>, <posx>, <posy>, <ancho>, <alto>, <color>)
```
Ejemplo :

```bash
    graficar rectangulo (rectangulo_12, 12 * 3 + 2, 15, 4 / 4, negro)
```

## Línea
Para graficar un linea se usa la instrucción:

```bash
    graficar linea (<nombre>, <posx1>, <posy1>, <posx2>, <posy2>, <color>)
```
Ejemplo :

```bash
    graficar línea (linea_Amarillo, 12 * 3 + 2, 15, 4 / 4, 50 * 1, amarillo)
```

## Polígono
Para graficar un polígono de n lados se usa la instrucción:

```bash
    graficar poligono (<nombre>, <posx>, <posy>, <cantidad lados>, <ancho>, <alto>,<color>)
```
Ejemplo :

```bash
    graficar poligono ( PoligA, 12 + 2, 15, 6, 50 / 2, 12, amarillo)
```

## Animar
 Esta instrucción aplica al objeto
indicado en la línea inmediatamente anterior de la instrucción de animación. Si no hay
ninguna instrucción de dibujo antes de la instrucción de animación entonces esta no se
ejecuta.

```bash
    animar objeto anterior (<tipoanimacion>,<destinox>, <destinoy>, <orden>)
```
Ejemplo :

```bash
    animar objeto anterior (curva, 50*3, 75+5, 1+1)
```

Con el botón animar puede decidir si ejecuta las animaciones detectadas.


# Analizador Lexico

| Nombre | Descipcion |
| --------- | --------- |
| \<nombre> |Es el identificador del objeto a graficar el cual puede contener todo el alfabeto \[a-zA-Z] mayúsculas y minúsculas, así como también números y guiones bajos. |
| \<posx> \<posy> \<radio> \<ancho> \<alto> \<posx2> \<posy2>\<destinox> \<destinoy> \<cantidad lados>|Es cualquier carácter que lleve una serie de dígitos numéricos como ENTEROS o DECIMALES. También cualquier producción de operacion aritmetica basica | 
| \<color> | Permite el siguiente listado de colores:   azul , rojo , amarillo , verde , negro , celeste , fucsia , lavanda , corinto  |
|\<tipoanimacion>| Es el tipo de animación. Línea: Será una trayectoria de traslación línea. Curva: Será una trayectoria de traslación en línea y de rotación. |

## Operadores aritméticos
Las operaciones aritméticos que el sistema reconoce y su precedencia.

| Símbolo | Descripción |   Precedencia  |
| --------- | --------- |--------- |
| +  | Suma | 1 |
|- |Resta| 1|
|*| Multiplicación |2|
|/| División| 2|
|( ) |Paréntesis| 3|
  

