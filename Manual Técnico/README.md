# Manual Técnico
## Practica de Compi - 2024 S2
**GrammarGeomCalc** Se desarrolló en Java Swing. Usando herramientas Jflex y Cup para crear cualquier tipo de análisis/proceso léxico y sintáctico permitió un lenguaje para la creación de figuras geométricas básicas.

## Organización del proyecto
Se Muestra una estructura de árbol de los archivos organizados para el proyecto.

```
├── InterpreteFiguras.java
├── logic
│   ├── analysis
│   │   ├── auto.sh
│   │   ├── code.cup
│   │   ├── code.jflex
│   │   ├── Lexema.java
│   │   ├── Lexema.java~
│   │   ├── ListErrorAnalyzer.java
│   │   ├── parser.java
│   │   └── sym.java
│   ├── analyzer
│   │   └── Analyzer.java
│   ├── animition
│   │   ├── AnimateObjectGeometry.java
│   │   ├── Animation.java
│   │   └── ListAnimation.java
│   ├── fileManager
│   │   ├── FileInput.java
│   │   ├── FileOutput.java
│   │   ├── JPanelToPDF.java
│   │   └── JPanelToPNG.java
│   ├── geometry
│   │   ├── BasicGeometricObject.java
│   │   ├── CircleGeometric.java
│   │   ├── LineGeometric.java
│   │   ├── ListColor.java
│   │   ├── ListGeometric.java
│   │   ├── ListObjectGeometric.java
│   │   ├── PolygonGeometric.java
│   │   ├── RectangleGeometric.java
│   │   └── SquareGeometric.java
│   ├── objectAnalysis
│   │   └── Token.java
│   └── reports
│       ├── InterpretSyntaticError.java
│       ├── ListMathOperation.java
│       ├── MathOperation.java
│       ├── ReportErrorInterpreter.java
│       ├── ReportUserObjectGeometry.java
│       ├── ReprotsToView.java
│       └── TypeIntreprete.java
└── view
   ├── Compiler.form
   ├── Compiler.java
   ├── GrapherPanel.form
   ├── GrapherPanel.java
   ├── modifiedview
   │   ├── ViewMenuOne.form
   │   └── ViewMenuOne.java
   ├── ReportPanel.form
   ├── ReportPanel.java
   ├── ViewsMenu.form
   └── ViewsMenu.java
```

## Analizador Léxico
El siguiente analisis lexico esta conformado conformado con por el lenguaje **JFlex** donde analizo los siguientes token.

1.  **Alfabeto:** Carácter del abecedario de la "a" a la "z" en minúscula o mayuscula.
  * Expresión regular :
  ```bash
  ALPHABET = [a-zA-Z]
  ```

2.  **Dígito:** Character digito numérico.
  * Expresión regular :
  ```bash
  DIGIT = [0-9]
  ```

3.  **Entero:** Cadena secuencial de digitos.
  * Expresión regular :
  ```bash
  WHOLE = {DIGIT}+
  ```

4.  **Decimal:** Cadena que esta dividida en dos numeros enteros por un punto.
  * Expresión regular :
  ```bash
  DECIMAL = {WHOLE}[.]{WHOLE}
  ```

5.  **Numero Real:** Cadena que puede ser entera o decimal.
  * Expresión regular :
  ```bash
  REAL_NUMEBERS = {DECIMAL} | {WHOLE}
  ```

6.  **ID:** Es el identificador del objeto a graficar el cual puede contener todo el **alfabeto**, así como **numero real** y guiones bajos.
  * Expresión regular :
  ```bash
  ID = ({ALPHABET}|{REAL_NUMEBERS}|[_])+
  ```

7.  **Espacio:** Espacio que se ignora.
  * Expresión regular :
  ```bash
  espacio =[\n|\r|\t|\f|\b|\s| ]+
  ```

### Palabras Claves
El siguiente listado son las palabras claves para el análisis lexico.

| Palabra | Descripción |
| --------- | --------- |
| ,  | Separador para las indicaciones de las figuras geométricas. |
| azul  | Se usará para detectar el color azul de la figura. |
| rojo  | Se usará para detectar el color rojo de la figura. |
| amarillo  | Se usara para detectar que el color amarillo de la figura. |
| verde  | Se usará para detectar el color verde de la figura. |
| negro  | Se usara para detectar que el color negro de la figura. |
| celeste  | Se usará para detectar el color celeste de la figura. |
| fusia  | Se usará para detectar el color fucsia de la figura. |
| lila  | Se usará para detectar el color lila de la figura. |
| corinto  | Se usará para detectar el color corinto de la figura. |
|circulo   | Se usa para detectar si dibuja un círculo en el área asignada. |
|linea     | Se usa para detectar si dibuja un línea en el área asignada y mencionar el tipo de animación. |
|poligono  | Se usa para detectar si se dibuja un polígono en el área asignada. |
|rectangulo| Se usa para detectar si dibuja un rectángulo en el área asignada. |
|cuadrado  | Se usa para detectar si dibuja un cuadrado en el área asignada. |
|graficar  | Está esperando el tipo de gráfica. |
|animar    | Espera de instrucción de animación. |
|anterior  | Mención al último objeto registrado. |
|objeto    | Mención de objeto. |
|curva     | Especificar el tipo de animación. |

| Palabra | Descripción |   Precedencia  |
| --------- | --------- |--------- |
| +  | Símbolo de la operación de suma. | 1 |
|- |Símbolo de la operación de resta.| 1|
|*| Símbolo de la operación de multiplicación. |2|
|/| Símbolo de la operación de división.| 2|
|( ) |Símbolo para jerarquía de paréntesis.| 3|

## Analizador Sintactico
Mediante el análisis sintáctico se usó la herramienta de **CUP** para crear la estructura del lenguaje.

### Terminales
El siguiente listado de terminales son los recolectados por **JFLEX**.

- #### Terminales para operacion aritmetica
Los siguientes terminales fueron utilizados para la recolección de valores numéricos por medio de operaciones aritméticas.

  | Terminal |
  | --------- |
  | SUMAR  |
  | RESTAR  |
  | DIVIDIR  |
  | SUMAR  |
  | MULTIPLICAR  |
  | REAL_NUMEBERS  |
  | PARENTESIS_A  |
  | PARENTESIS_C  |

- #### Terminales figuras geométricas
  Los siguientes terminales fueron usados para recolectar la información sobre el armado y construcción de objetos geométricos dentro del sistema.

  | Terminal |
  | --------- |
  | COMA  |
  | ID  |
  | GRAFICAR  |

  Los siguientes solo indican el color a usar para el objeto geométrico.

  | Terminal |
  | --------- |
  | BLUE  |
  | RED  |
  | YELLOW  |
  | GREEN  |
  | BLACK  |
  | CYAN  |
  | FUCHSIA  |
  | LAVENDER  |
  | MAROON  |

  Los siguientes terminales indican el tipo de figura a dibujar.

  | Terminal |
  | --------- |
  | CIRCLE  |
  | LINE  |
  | POLYGON  |
  | RECTANGLE  |
  | SQUARE  |

  Los siguientes terminales fueron el funcionamiento de la animación.

  | Terminal |
  | --------- |
  | ANIMATION  |
  | PREVIOUS  |
  | OBJECT  |
  | CURVE  |

### No Terminales
Los siguientes no terminales son las producciones que se dio para analizar sintácticamente el lenguaje.

#### Listado
El siguiente listado son los no terminales usados en el archivo **CUP** para el lenguaje.

| No terminal |
| --------- |
| inicio  |
| operacion  |
| inico_opereacion  |
| animtion  |
| grafica  |
| tipo_grafica  |
| tipo_color  |
| tipo_animation  |
| parente  |

**NOTA:** El no terminal de inicio es "inicio".

1.  **Inicio:**
Esta parte es para que sea secuencialmente, es decir que si produce un inicio puede venir un acciones que son las instrucciones que debe de registrar y crear como objeto y si viene error es porque esta vacio o el token es incorrecto para iniciar.

```
inicio -> acciones
inicio -> error
```

2.  **Acciones:**
En esta parte está enfocada para que tenga una secuencia de acciones, es decir que si viene una gráfica o una animacion lo acepte y si viene varias secutivamente las vaya leyendo aprovechando que **CUP** es LL(1) analizando el siguiente token para ver qué produccion tomar.

```
acciones -> acciones grafica
acciones -> grafica
```

```
grafica -> GRAFICAR tipo_grafica
grafica -> ANIMATION OBJECT animtion
```
3.  **Tipo de grafica:**
Aquí recolecta la información sobre los atributos de la gráfica que analiza su instrucción.

```
tipo_grafica -> CIRCLE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion  COMA tipo_color PARENTESIS_C

tipo_grafica -> SQUARE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C

tipo_grafica -> RECTANGLE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C

tipo_grafica -> LINE PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C

tipo_grafica -> POLYGON PARENTESIS_A ID COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA inico_opereacion COMA tipo_color PARENTESIS_C

tipo_grafica -> error
```
Los colores posibles de una figura geométrica.

```
tipo_color -> BLUE
tipo_color -> RED
tipo_color -> YELLOW
tipo_color -> GREEN
tipo_color -> BLACK
tipo_color -> CYAN
tipo_color -> FUCHSIA
tipo_color -> LAVENDER
tipo_color -> MAROON
tipo_color -> error
```

4.  **Tipo de grafica:**
En esta parte se analiza la parte de operaciones dentro del archivo de **CUP** ya previamente teniendo cargado la presidencia.

```
inico_opereacion -> operacion
 
operacion-> operacion SUMAR operacion
operacion-> operacion RESTAR operacion
operacion-> operacion DIVIDIR operacion
operacion-> operacion MULTIPLICAR operacion
operacion-> PARENTESIS_A operacion  PARENTESIS_C
operacion-> REAL_NUMEBERS
operacion-> error

```

## Diagrama de clases