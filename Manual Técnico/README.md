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
La siguiente imagen representa el UML del programa.

<img src='https://github.com/Drymnz/Practica-Compi-1-Graficador-2024-S2/blob/master/recursos-git/UML%20practica%20compi%201%202024%20s2.drawio.png'>

Tambien puede usar el siguiente enlace para ver mas detenidamente el UML.

[IMAGEN DEL UML](https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1&title=UML%20practica%20compi%201%202024%20s2.drawio#R%3Cmxfile%3E%3Cdiagram%20name%3D%22Page-1%22%20id%3D%229f46799a-70d6-7492-0946-bef42562c5a5%22%3E7Z1tV9vIsu8%2FDWtx7lphqfWslwRIhrkEOEBmT%2B6bLGEr4BnbYssmgfn0t2WpZUldlmWj6m5m1exzEjA4CapfV1f%2Fux4OnJPZy%2Bcsfnr8ko6T6YFtjV8OnNMD22aBa1n89%2Fyl1%2BKlMPDLVx6yybj8tvULt5N%2FkvJF8W3Pk3GyaHzjMk2ny8lT88VROp8no2XjtTjL0l%2FNb%2FuRTpt%2F61P8kEgv3I7iqfzqfybj5WP5KhM%2FWP6F35LJw2P5V4de%2BYX7ePT3Q5Y%2Bz8u%2Fb57Ok%2BIrs1j8MeW3Lh7jcfqr9pJzduCcZGm6LD6avZwk0%2FzBiidWvO%2FThq9W%2F%2BQsmS%2F7vOF%2F2a%2B7L9f%2F78%2FH369vrtnDSXJvv3xgoeMWf9DPePpcPg3%2BZy6SrPxXL1%2FFQ1r8msymMf%2F5nI8%2F0vnytvwK45%2FH08nDnH884v8W%2Fk7n488kW0748z0uv7BMn%2Firo8fJdHwRv6bP%2Bb94seQPT3z28THNJv%2FwPzaeln8m%2F3K2LFGx7SMr8CPbEb8GjXfc5n8S%2FzaLv5olC%2F6ea%2FFYWOulL%2FFL4xsv4sWyfGGUTqfx02Jyv%2Fqx8ldmcfYwmX9Ml8t0Vr5UPiz%2B4yUvGw3BKvPyNZOks2SZvfJvEW%2BwQrd86OV6YX5QvvBrTZ9n%2BcVrjzXwvNBqPAmxBkr%2BH6q%2FbA0C%2F6BkYTcuPImLD8dZFr9eTPgTs60p%2F%2B2MLz2ZE%2F5kliv7ZenfyUk65d%2FinK4WBgdnMp22XhLsTJMfy43kLJ7i0WT%2BcLH6nlN3%2FcpN%2BWzyl1L%2B3h%2FT1Rp7nIzHyTy3crqMl%2FHapE%2FpZL5cPS3vI%2F8%2FvmROrCPvwOP%2F8BP%2BOVt%2Fzv8v%2F%2FZseZLO%2Bc8ST1bWTTgvv5KcmX4odK46GZESCID3XnjkL2Dx4G%2Fn4Qv3eVdPSRYvJ%2BmcuBieC9dtchHqxyLYjkX5c0xGV%2Fd%2F5bs3gTE4GL5vHBjhdjCO55MZ%2BQokJMLQOCQiGYmbJH88X3m8WTiH2s%2BRVV8iPIbHgx9uTOPDtWQ%2B8kfCTb86qhEFw1Pg2NB5QicETLLzdLKyX2FncT5nexl5xs01TdZWvcuNfvqBSZZ3ZMs7gJWn8X0yvU4Xk9Uu5pxmxfe2rL%2FNwE2CJ%2FPHJJtgG95z9zF8iGd3W1r8B%2FbHQoo4vEheklmcRw38g%2Bx%2FyBMgAOEb5wkciIhFslwJd4e1nYGAwAAi3MtDYAIhS5U5EK%2FzZfzyPcm1qMPb19l9mv9Ro%2Bfs%2B5Lbfk5sYOhTlm8aG4Bc%2BZAsz%2Bc%2F0uuMP5pD4gBFpwxN40CWKbmP4CRsOmjmYPAHfsx%2F3XwWJXIGJ8cDLzJ0kgMomZybO27i6yxZJIUPKVHJXyXVCoOLwLgwFBAyeRB6x229ouDwdsk3mAf%2BHbN0PPnBLZifBWm7wYAjMi4klSXNYru5qMvbNcdRk8CJj6H5cJhpYaknS5prPlbX58SGIjYc00JVj3Ww0bhKJ0YUMeKbFpR6oCpaMNK6VidIFEESmhaherJQ%2BiEej4vjbNORSK6Fv235%2BkQKKkq2jmVauOrJCmpOyskkG02T9UGG%2Fyn8OdpW9cLTS%2FuF19YLdCmDQpBtXEAL6KycoNv%2FPvMf9k0ETYkglIxB48JeIJF0tVuNlvH84Y1u6Ffr80eCCgOqwLg4GRBvOVQXk%2FnbeHp6saVvsYkpDKYi48JqQPjlTF2n09eHdP62vY7clgbEPGZcPA5kxHLE1sJxRcS4zdS4zVRKzGAw45gWgftAluxiBcFdej5fnmTJrzU2y5e1KrRKmCJCBifEMy3C9mVh%2BeTr9fcil%2FJ7PMo9y0JCQWd5Z3hkewfvuKKT%2Baz05NU1tshnrXHgM0%2FmgNlW%2FsOjsSALyB9Efa%2B1odCXnMJ2p%2BBvIELYP6yMug0AxJxq35FsS7n0wxvb83sbG9HWYHKs7PcPW6ufokYEInzXiOUva7VNJMZpSUWZTM8%2F%2BT5%2FnhUHi2n2XdooigNHvjXnxKx%2BPxGRpcUtvQ42RSI2sTU0W5FtBFuyiiuKdAyKK9lR5NT%2Fc99zkGkHFmsGmW5gSSA40GHD94PGk3DxuOjRD4DahuztGvzuqFPmvRcemGdRQET9K%2F4ZH03So5skHq%2B2l3%2F%2BER8SE0Mz4TpNJgxAAhA9iwjin3%2B4S15SoTcCBr5nGgbBxmr%2Ff%2F7hoURuMaIBiYYwMI4GWbP8MHqMs%2FLMn0Px8fnHD9ojMHBgVmQcD4BuKbzDlzj7Oxlfp7KGTSy8nQWHGccCkN8qWDh5zvKfmGDAgcEzLnoMgBTWWvSYLfOjBLGAwEJgXggJJKMKFs7mYyIBiYTIvPARSCq9T9NpEs9XNBwvz64%2BEQsYkpN5oSMgQQqv8Gkyj6e%2F8X%2FGLY8b0gc6XuJA4ZoXQwI6ZAHF6%2BvqTpwwGB4D37zocaP2%2BPo6SqfPM2rqgQFCaFzoGALq4zRd5UxyEnLhiTgYnAPHMi5wDAHdsRk4fry6IBYQWLCNCxxDQHOss8CPEKcphQooNHjGRYwhJU8Okzy5xfLBfkEiXmpTCGZSFtlNh1LuwoRafaFgEZrnEMB0yjm3ddFpttaAJafk%2B%2Bj56Sh7ni8ns%2BSI0iGxQHEt4w6ZISBGPokmtCUhP9MJadMYONjmHTXh2vR29zciAokI17xDpyxGUldAPXD45p1CwZair6%2BjabpIyF%2FgIxEZF3lGYBfR19e8LfVSPpJkqw%2BIFGxSPOZAVRU6QQFbir6%2BLvJE2kNqBYANhOOZBoQsaa6AuE8eJqLqb578WiVak8NA58MDy7B08gHOWHp9zY1d8xeinwghMTgSQWQaEqD8WVyKxsvSZzyVSvMaEbozRSrcsZhpgIA66Cs3%2Bvxh%2BUhRBjoRtnFhJzh06fX16XnxeB%2BP%2FhaBxvPsns4lCgBxjQtDZQn0wPanxXMofp%2FkLQB%2BxKOEv%2FBQfkH8fmA7LH%2F84lrle3mt8v12FM%2FnQE2Yxp4DLjtyrfp%2F%2FsF77jlQNXoQ93KRyJKo4WTbroyT50kPAg2vUCKArur38CvFMt2sjMlo9yKB4bWbiCCxtOlYzvi2Uw072OhaKuX9eB5PX%2F8xzKfY79iHRIEo2VqPeJNdiCPSbRrg%2BGhbUmQBCaDr5qrJYpRNngpmKEDZ3ZFE3Y6kp%2F3xknwiS1ZKL87%2BPPty%2FP3q8mwVoZ7mv9r%2Bf5%2FT%2FGncTvIEjjSPYvNfkhfuL5L8gzw1MMn%2Fwvz48xz%2FlazfQ%2BgMjw7U8Ug1OjZFG4NEG92WFkHdNksjGhoUR6VI4RDaNigpEAEJBkScylc%2FKI9WCDwky9M1BTR1HAUDSNFQjYEsgi5eZyYdGmx25Lxv7cG3m021HUeM260Znon0usbBwWEO%2F%2BnXJ1WGBwKofRaC55evF3fn1xfnJ8c35Ad29wPlIuuoPc8J7wWEjQgApG2WAHy%2BOTu7JNMPb3rXNsL0YB5nYfrT8z%2FOT89p3SMY33eMMD6Yp1kY%2F%2FZ%2Fvx7fnJHth7d96JpgewYmZBa2P%2Fl68weZHsH0zPKMsD2YY1nY%2FuPF8cn%2FJdsj2N72jbC9vdn2N2fHF98vv345%2B3h2c0sMIDDgBkYwAKqCpe8%2Fvzm5IOePYXw%2FNML4oPonnP9XMj2G6cPICNODaY%2FC95%2BS5TEEHssIy3dIfOdkeAzDO0ZIe6xT2jv%2BRMIukvk9I%2BQ91iHvXX38%2FezkjoyPYPzACHmPdch7J1dfjsn0CKaPjFD37A517%2Frq4tvnK7rTQbC%2Bw4zQ9%2BwOfe%2FL8c0VGR%2FF%2BI4RAp%2FdIfAdX55%2FOb47J%2Fuj2N8zQtyzO8Q9miCAY%2FnACGXP7lD2bniof3z5mZRdFPtHRsh7doe8d%2FLtmJw%2BShaPEfqe3aHv3Zzd3pHIg2J81wiNz%2B7Q%2BD59Pfnt9pyO%2BhjW942Q%2BOwOie%2F6%2BObs8u7s9vz2%2BwkhgIBAaITQZ3cIfQlNqsexvWcZofQ5XUrfzdkf51dfKZUHw%2Fy2EVKf0yH1XRz%2FcXZ5ekahH4b5XSPEPqdD7Ktt%2FhT%2FYSDgG6H3OR1638X5JQk%2BGKYPjRD8nA7B79vZxcXVf8j4CLU7lhFqn9Oh9t1%2B%2FUKKD07dlhFynwPKfWUFf9EMw7aWSTbLZwVfxrNkQTAgwOAZIf85svzXqNouGwF5hAACAoERGqAja4Bl3XZpfJH0T9Yf1PqREfKfI8t%2FVel2aX8yP4L5A2aEAujKCqAo3i6tb5P5MczvGKEAurICWNZvC%2BtHZH0E63tGCICiD2XN%2BmUFt9j5Ke7DsH5ghPbnytpfq4a7pEDuLk0QvB2CyAgV0JVVQFHELXYAi8yP0MeFGaEDurIOWJRxiw2AkfExmvgYIQS6shC4KuQWtrfJ9gi2943Q%2FVxZ9ztfmz4gyyNYPjRC7nMhuU%2FUcos9n%2BJ%2BBAAiywjFz5UVP1HNLcxPET%2BG%2BW0jFD9PVvyKeu7S%2BD7ZHsH2rhFynyfLfVVBt1j7FPVh2N83QvDzZMFPlHSLoJ%2F0Xgzzh0Yofp6s%2BNWKuoUDoA0ApXmrZYTe58l636quuzQ%2BaX0otrcjaBqDTgxk3a9W5C08gUM0oLRxtkyjQRYCi5JvERTQloACQsBMA0FWBUUBeIkCuQQUEiLbNBJklbCqBhdegVRiDBYYPLpJJwuyYNisDRdAUPSIAoTjGgaEL0uIZaW4IIFAwADB80wDAdATq7JxcYqgbQIFhsA3DQZZXFwXkQvHQDdLKDBEgWkwyFJjs6S8BILkZpRpQSw0jQdZdyzqy8UuQSEDCgiOacqjLyuPotpc7BGkMeBMEDNNdvRl2bGsPRdOgUDAACE0TXb05SPCdLIyYGHo%2F5T%2FNLaXlWfcXtNkbda73OqnH5hkekc2vQOYeRrfJ9PrdDHJJ9zz17Lie1vm32bhJsKT%2BWOSTbAt71h7yYwM0fKyzHg8j6ev%2FySZhITOWfLuwTseJG9FQfmYKxcQRZLpbQda9KL6E8P2sqz44SJ5SWYxf3G6%2BmBOG8AebqBYVBvdgDDpVtvjmT6QBcQP%2FAdb5KveWn1Ahh%2Fe8CLzW6fh5WMe7fTDWzqw%2B1k6xDO0LAYe2B%2FF3n5YdhvK%2BwzxZW3nd0hF86kFN2fyP7T6h2citPSvfrDb4PF8Mp0s4uzwf1YHv1wb%2FJnyP4kYGJwBZhmw98N9Bxdn%2BQ3iovAQ3AA1Gu7TdJpQLIgChG1ATAD2InxIlheTxXJFRY2F4yyLX%2FMvEA0INIj6AJ00gN0JOQ3X%2BbGgRoI4LxAGg2MQyHnqyjEAx5KUToFHDLM4j8nJMSiSDCwDgkdIKsw5SK7u%2F0pGy8%2F1v8oU3dA%2Byg9jtf%2B9Yx3RZeI9lZ8QKaA1LELRVKqOhRu1HoSHhwmgKtZ8gzWt%2Bw%2FyFXv4imCLr5CZ78WIbaMxEQJy4%2B8fn%2Fny4ARYf4mPiIWhWXDdJguOfhTkjEUZhas56c8INPh%2ByzPop0FWKT98zuKnxyS75hFD%2Fic8ND4lKIaGIgyNg0JWKT%2BM0%2Bf8wfK%2Fb%2F7wPE0JhOFBYMwyjgRZqlyTsJimT7RNYIDgtCNI%2FSDIEuUahBd%2BjCMdCgMEzzUOBFmdXIPwSiAggRCYFznK%2BuQahHuCAAGCyLxIUZYkP%2FzIpyYdiHSGT9c0PxVFYzIvVgR0xyYLXwgFDBRc46LFSK6DpyQ3BMv7LnipsM3yeElvkSwuFvlN8i3VYafMlOfDdVxa5F8G9Gvw5as5pdOh0BfAV1o6%2FY6sZnL8ilw6K3te3ZYTCIODEO3nhjBBABTMEoO47owWRAQGEQ7zjSMCUDJLIri1Rs%2FTeJ1TU9toSlz4xwQKBihOaBwogNLZBCWnYfGJByQiZrzgsS1Bow4a3zIOGkAVLaF5ip8XyWFxAF5OZhSLoiARmheLAvpoQcFkPsqSGf%2BJP6XZjPuTw0o2ndULgV6KT9aaKpGDkaBjmRe8AqJqRYHYg5Lb9Ck5%2FBgvJqPyh5qMipiWf1PKP2gUlY35VvVn%2B4VvBBQGULZ5sS%2BgzNZcUbxIrrLTpPiI2zSej8SGxX89l76lzhH%2F9e5XSiChpA4aFhvblgWkkQp1JX%2FG%2BeGpyyURJxicBIaFw3bVV0WqVIAyzvVWJ0R26AXMLX99z9UJzKqU%2Fep%2BwJGLG0PReqLOgmNHzSeBVcXC2ZA12g8XTXWfn5Oe5CoWchXbXIVYeF2VCW3ee%2BEh5mBg4AAotWWIyh%2FHZL5CooheiYeheXC9Jg9AdYJqHACZFsLhG%2BEwPA5%2BaBwOgBhb4JBmY6p9xoAgYsZBAIirXaeMu7RMOCA8hseDMdc4Pqh55gDZRtst7wTgGWGb5bGyjfg%2FWBZKq2yjXIqAjxU1EbQdYW760rf6l8qdJ3%2Bhlxci0QMDxnbo2hNGTDckq6ycxjaDD5wMjiHlnaBQ0Y5g9VPBZMk0b%2Fa18iSchdOmCyIsULBox7QGYAEmym7A4hthgaKGtUNZA7CQxdE6Fld56EEwoMCwZ3SLCQPYLHRDzJnT0Qg7CRMUTHzLOEzAdqLr%2FsJp8SHxgMJD6BjHA9hNtNhDRuks%2F5nv0ka6asoBIDoQ6HAs3zg6ZDEV3lFaNOi9pQ8P3u%2B9vOeLO84qWdWV24u6onSucS3v5T86GgobM1Sf0sUL%2BYM9%2FEGxurru3%2BWEDNDymB4ASC8VZn%2BhtAsEs7ueCWYHkkCrIJGGDWDY3Q8NsLsN5GzmonRhvzwkXP1O1h%2Fa%2BhEzwfo0bmiQu9Etts5vxXsaGy%2Bes0HxEIruD%2Bth3vpms9j%2F888bG0P%2BguQx6LyIgZERAaIN6o6VCM3X5wuJSSjmNyJQtEE9sSzzWJT2XzsQIgGDBDNCxw4lceUIXiiPAcf8ZsSO4CCiuiPg9l9HDkQChmLUP7DEJAGcRVQFidwXnI%2FJE6DY3wlMsD%2BYaLn2BNz6tRMDgYABgm%2BZAMLGHEdxOOS%2BYPUhuQMUCkLHAAocMKdx7Q4KAEgyUEFEfsVsABFgOiPloKhBwI5MQEBWH08m2WiaVNqjZHudOQXBUeAdvN%2BkAt%2Fzm7X%2BbhjJSQUeAxhgLDpCGz%2FIOdhY0J3F4wkNDtrHARRra3NUEBwBTT9A4yNePziuZFu6ahre2J7X29iItgaVwZa%2FH%2BCWqf6%2BlfugAAIBKd8xwn%2BAcmOlNt%2Fk5qcAEsP%2BETPC%2FrLIeJOMlvH8wdQY0jt6zyGkZ4sR81UICVDgixYcjRCSewzECHJjguIj%2FyeQA9jHAQTdAaR31NPy4k4Iw%2Bwbu1QW%2Fyiy%2B%2BB295gBdndpWNAw54ZuWwdBX1vjbfEuKBPKu%2FzAJ4di21h%2FvnoAFEkiQBaasJGIZqcbDhK%2F8X8EnSMwrM%2BYEftJd%2Friajsh%2B6PY3%2Bm9x2DaX85fzAe0mHmEdI%2Bcd30P4UXi3qc6RHpykasnpkY3ELCs1Q%2BPxsHG3pE8rvjzEzmAPRxAsbY2nyPdtUW3mh%2BvxbQLNIysLP%2BNLI9geTc0w%2FLUCnKQs%2BQWawd2f2sjnibBrMTGXj%2FwQbLcOBovfPtEsSQCYqFlhkMBEx7rtVB%2FfqLDBAYAzDIjmPC2JDsWCNT8A9GAQYNtRoDhdfdtzJs1kj%2FAIcDbIejAJABUFxv%2B4FvNH1B4gEND4JtBgyw2XqfT14d0TnoTht7keqJFapfeFDBIckTWmzxZdyxVh%2Fnz7D7JbifjZEG%2BYA9fUCyyXVUnGAJEV7BRb6S0FRzDbxCdlBt%2Bo9xIiStIlt8gQCm3PMmNg8iNW6wdwbEeaG08udED5cZ2tDew4tgIHSijRb2n2SRDKXc13ULk5ZoTkh9QONggQKnmwO%2BeJ0PJTWgAbNCflAPQrUBSehMeARs0J%2BUEyArk7X%2Bf%2BY9npuT0ziutnchul8lAldYOwABypbW%2FsdJ6scKBfMAePqBYXLuWWkPWRzyK%2BFRqPci5c4uxN5RaQ8ZGtDVYat1y%2BAOfOgv%2FQUEEAlMbaq1VO5DuWuuCLooiMQDYUGytGgCoo6M%2FLX724vez%2BfMsycoZUf5D%2BSXx%2B4HtsPyh1%2FyIOTGn4x2xsP6%2Fdxx%2FMr7b260A1LYlgJg4cDQA8tzGg7DxeJLF0Y8XX8%2FIgezjQLqrbGS4%2B7GA1%2FrLl7XJm7NTsv3wtvdC02wfyHrkt7OLi6v%2FkPmHN3%2FImuaP9JtfViM%2F35ydXZL1h7d%2BfhVlmvllKfLjxfHJ%2FyXzI5jfDowzv6xAnnw7psWPYX3PgkJ5ncaX8x0%2FfT357fb8mOyPYP%2FAMc3%2BsjB5cfzH2eXp2Q0BgABA5JsGgCwifjm%2Buboi%2F49gfm5%2F08xPyY%2FDXEJtMbxr72N4USaBYXgoEXJf7djInAUnOLJDL2Bu9evB%2BxWQI98q31PdYbO%2BEAVu60HgQSVriCfnNycXJCHv41OKJbpZQpb57nmfgGb%2FUNYRL84vyfoI1vdt86wvy4jXVxffPlMsiQFA2F7%2B%2Bu0v64g3Zyd3x5efaQPAIICxtg%2FQj4CsJd7%2B79fjG7I%2Fhv2lCEC%2F%2FSmncZDj5DbLS7u%2F9vNkCGU47nuevLr%2FKxnRqRI%2FLYk5otGqOFREYi5knSVxQ6jpWBnKGiUdK%2Ff2LcVKfdOxEuIBc1eR8xzpWIlj%2FT7HStXWl5VKOlaiAdDjWKna%2FlBiIh0r0Qjoc6xUjEAk64p0rESzf49jpWr7MzpWDnGs3Gb5HsdK8CiAd6yMZE1x%2F2Pl8XwyK7%2FPnAOly458%2B30fIlnQvJt0ItHfYKsgwYqfHg0fILfx680ftG%2Fs4z2KtbjRe7g1U26VIPHEggiYHEOHRRSL%2B5EZFvcoOhgiOthi7Sjob22G1zglksXA36%2F51j29S68vP5u0s9vOkRX4ke2IX4N3vMuH1WjvqpJBNE6sweCIDKA6DPwnbzwIhseGLBR%2B4J9%2BmvCHw%2F%2FCjJvyZ%2FrbZJrSbrCPf%2FA7%2FQOAey88ELNbI2AINf%2B08Bf8g79WHxAQOEC4fhMI%2BTSpnAdZShT%2B4ep5%2BfTMt4csiWc5Cdyg45ioGJ4KHjSaRQWzZHXxQ2Ov4A%2F3uNpGiIihiYhs44iQMxk%2F1PeKEgixjxASQyPBmGccE7IS%2BUHsEjUH0dxHiIzByXBC6DChEwxHsjPJDwiG99k%2BhkeTnZglC40H9seaFkGt13A4iExzAGBzxzoIkABxAh9EiRkMZlohpgHMgL0b79N0msTz1fnzZyKTA1AzpQ6fKGJWKwA1gBio2aMYWZg9z2m3wRE1jQs3wQk25C80c7JfdIrJCThrhhwFFgChaxgATJY1NwhWemeZ%2Bo3%2F3nOX39Bxm4lQLLLkKRO2uKVsXJhbQfNBBHhcUDLlEHpFub42OwSZ7F4k4AkWIk1z09DrYsUeFr99iefxA1%2FxtjVdfU6bBgIjjg0u%2Bm2I4CVMMiYnTK4Zicfjw5N09sQNuhoyMOIfExcIXHjwZqCTC1DsXPuOfDs%2FbMzLrc25XP0TCRQEUELzHIgshlZK6Okno0JP%2B8gLQ9vx7MhlLPDfcw6%2B7woRusrOY3KqpusDLDhR2HgOiIEnMGKbf3qajp5nxYYyrj4kV7G7q%2Bgu7pFx74UH5gEVztas5Konyq7AQcH1jEMBTtQs1cwflHiFwoEfGscBnKBZDb5bchKgMIJgeDMMETMNBhvIy1xHCGXO1SmFDGhI8FOfcUwAmZllnEBJmdg4OIFxOMiS5ociWqCcbVwWfMs4FoBJ2lW8UOIgAgkCYnAgQsc4IKgZ5TAXXVuEBcvfy%2FJ4F112d0Lm6SdKgUABwcBwEUyzrJPQVptO2rJDY%2FB6uZ8QPhj4GBhegjmX6yzdvwgkE0FqxabypZhyjsCczfL29C%2Fal5B5aIWmBvAA5mZSLjcuB04rUNXPgSMrnJyDIXaV8rxb%2FFptWMTU4EzZkWlMyQppi6k2HoXfITYGZ8OzTWNDlkvXNQHEhAomAs80JmTZdOOdmtZCgYP3m57lWW6zeZodiMdes7wnSruavXXxdDKHBNJBBNLClh2VAP1MjWhoUBDly2uZD9exHpLlOX9a8XyUHDaz8dYBZ6s%2FVrpo7xjX4x%2F%2F4Y8yLxmgbWNohMTGvQ0hG63vJnNAKTV9Sih4UEWBJxeTKacAVERH03SREAaKMBBTdnViAAqaeX3Q2TQpt4%2Bk%2BIioUENF1Y9IJxayrrk5LNB5mAiO%2FH%2FTccKJxOzdbcb3nSMfzfyuReeJQc4TUfd5IjjqGQjgnShcUGWkE4VB20U3RI7XFyJMimQ98uPzjx9JlozPZ%2FGDnLmpc8%2FwjupjEQP2nusFg0C0h6l8itdXpWg9BxuPDmqsOch2UqyyzduJDLbuzQUsNm94hu5a8%2Fork%2Fzb716fkvb20u1paIt5M1iOsx9YNmKECgqhIx6CLJPPWfz0OBktJB1DfME%2BJUqGp8SLzKNEljo7GKBz7BuikLARhbDIli9EqyhR3Tk2oMBjkMBjS8s86BwLWhsx1ACFzPFk8USK9pB7QDcJ4GEUJAETBVm8NO8Q6r5nd1%2FN7qtqxiJgsxfHPlVZEB6plsN4%2By2qJaAvQKZGNHS3Zvkr1xoPW6dCfnxs5dj%2BSLNZvLyMZ0kjGzddqZmUeTvgnrFFwARuPCCeEK%2B7PFm%2B3CSCy1itfs8Burr%2FKxnlSkW6%2BqCNEMkTSABB2RSqAQK7bS64ZZK79NNkecifdNzSucRLVVdFilAVwALlXKiGBVRFF8lyZZj8hq0URWPxOcGhBg4w9UI1HbKyyQP%2F%2BCHXrYw6wfybrtF8t32iiZi8qzgi8NRzjSb2OTrfvM0JeFuqTLdfo8Eg4BkezNWsvMLhumww3wKKw0y62kFypyBlY2z0JrSDvBmeHldlIDyIlyAePGeIwg3tsPS4MVMOi6yd5q7kUzxapuVfYEr88b6vzLxAyJVdV2auDQSfqFdmPomowwQZe6R%2BgtbGCyv8ramf%2BdI%2FrAmm85pcWuwZ%2BeppfJ5j094%2FimCE9o%2BhIQJv20CIMCmStVPQ3nTZtt9G4UaiC17lOgIos0Y2uoO4S1BG5yC7RLF4dis4lg0t5oFhGFrWKqvCMIMW%2BHseNuhYTEqeAoYNQm49sPAMDyZYrixexgfHF%2BefL7%2BfnF3end1UW%2F2Edvr9HIHb7QiAmYOq93lSH4dx%2Bd2WBi4zQUszvBsIX5Ybz6%2FOXkbJ0%2BphmuT333Ngx0Jhw8rvO0DSLJQyjRnZhbTMB1nmwa6RHWhpzNAOkPqqak6jVvm%2FaL4f85zWogfn%2B0EeX918v0DuZimGeLVqfRfc9uOYIr59HMQWgXD7lD8wAMTrLxcAE3sOqrTJOOPr%2B2f622SaEg7D49Bj0p9qHGTdrzHhbcS9czKfjAkJJCR6DP1TjQQwuEfsEOIqQNpDCIyhwegxAFA1GLKK%2BKGxYdToICKGJ6LP%2FD%2FVSMj64ofWlmHRqC9kLHoMalGNBamMw8gPWyzfY%2Bqf2mSEAMxxXIcLNEkDhwPzgkgwXbEGQvPA2Srqq7YQwgUDFwNDS3ACz3qyV%2FzwHGfjOLvj1k%2BJHY2ClnkxaCjrnDS9CR8E86LOEMyELEHIM%2BXXZ9VDWe8kSjAo2T77TzUksuDZgOSkfno9hHVQQgUDle1jAVWjApaD7xmKUB8KNRj1mCqoGiOwUJymfClkYvtUQNVMwBOAesQoBIwKYLaPClQNDDjup3%2B8QtiowGb7NEHV2Mh67EX68GDY%2BI9%2FUw8K5vjtilCgB4VreTIH6npQhJQeOsj9TLglPXR7DwoYBDzDgzprvVi0cA%2FrjWQez6RK0A0uhHaQNxPTo%2FEESAxiL4EIlFen6cPhRfJzNQt9WvzeOPrOFg%2FFK3ePWfprZQfbWuYfzykaUcNSj74UylmSFdoSIoOikffdkSKy2%2BUoUA%2F3EBhq7UeIDSkiUHY9qBUi3p79cXZztt5jQC7ILWx3C9EGQDrbvENAIMYhEVWeDxKAbrG1BzZyh2yNWIgYyfpnrmydz00rUHKP1ntl%2Fut7Lke3mag5q7IEbblnqiP2%2BgYKod18EIi7ApA%2BelAkEK%2FwqCqU%2BE%2BdxVSitJ%2BP2FKULmPfCxPRzwQDC1ns%2FFARUEsybzBCZAxNhhuBfkAnGDQJaJiwodvwgbuX4RHDRTCbdH3ZwbfQOCuvzhr38qPy8owyNhAw2RAn6PQPoLxZspC8TJbJ6SRLRiO%2BHgUh%2FMlMfnBTZoQIAiLMCgxjxLZAPbOXC2nIllTQhAaNY5pjsS0wtXS7R2kQQ3WRSLx45jkZWe7cdmDRq3z4jf%2FetfLhifdUCrgFACEauDSUD75bNZ4DWnMW2yIBdIiTTLnQusSNNtm9SEA7ytgWmA3acg5iK%2BGWl9swk%2FDx1g1lGzU8%2FoDcwDZoMPcTMF%2B0aNbNKRhLqcTUwROFDA%2FeIHSSASaGlvUsoymNTVYHR2ie25DTP8FDCDX%2F3C%2FW9Kvc3a4RynDnV8wYg9I7hwkud%2B7%2BCZoa0dCg3vmQLI%2FvF%2Bn0eZnkq13y%2F6RD4PAAjECG23uj5VrwEywExLqPQvIyWSwXEhFUj4gGRd9O4JhQgOLlGorZ3%2BNJRlAohAIYX6wcClmhrF%2Bp8j0kHxIlQUG3HlhMQFOLlUMhV7xvMDiViw1zgsg7hzdPEFC5mA01lVdWLlYlh9J54m0eoFhebykXg0HAMzwoOxYugbaG4baGLWD0qAoDwcCr5LEZKDtW4UNe2%2BGcHo4e4yyXIQkVVaj0KPpSjgosQl6my0%2Fp83xMI4kGVyXDdgU6NJEoAkr%2F8CYS2Yw0yWFiiN0nEkGWxptIxP8%2Bab3%2FfrVa4df5YjZqlf%2BL8l4C8dyrLDpP1iOrNo2a0l5EDRJ5gTd6gS299LanvYAk4J0kbFCDrIp%2Fy7Hjj%2Bkv%2FhR%2FTLLZ6STOWwycpLMnbvrVV4vHUnslby9wdf9XMsq%2FOksWi%2FghabUhWE6W08Zk83TliO5enxLK90YAb3vmDMgd4hW4DeqcFXii8Scn70tB0L7kEU8IPG3Pt1HOE9gUFIcnytpRgNj2rB3liMkponfcvGYdkP9N0zyZHzRPzG7gRRIGjviTtYzzrIBr1coXYc0qiCbnsLtzsLcUx2%2Bd3wlSgdfRsRLqQAz4inmezalNAgIJ20d3KidB1lUbozunyUsyI6%2BAwML2cUvKWZAL5D8UewLVA2CSsH2SknISZPX1Q7UtEAyYMPSYz6maBgeYAS%2F2BbqLxeZh%2B4gk5TwwydCkvyNYfvtgTtDyePq7yE1vylYrWeGwfoRcK%2BXVptEQ1AvnQVonCjTGhZUOKHYWfOS9wjkyNF0PhQXzAktHViXrLJwU7oJwQJGhDIwsO1JDS%2B%2Bw2ioICBQgDAwtuzNCl%2Bk6bZh4GJyHrXM2leMAToIvAs51qNkIMqvYsnHvCV99ETNvZ2brwE3lzIBtPmuBJrU4wcdi%2BwBN5VhsqnKvxZxEhgIyto7RVE2GC5a7N2JPqjtRw8bWiZnK2QAzTuthKKGhBo2tUzGVoyGLoTfJE3%2B6i7v0j0nyS6JAZ6KVc2Q1c7kP3nGmFWegOZ4qCOSTq8%2BAATWO134QeHjIqmeeWHE8j6ev%2F%2BRzD624%2BpDcxc7uolh9HdKGBHwvQDD9hSx95kBwn8EfUV7UlP8ZPyHHQTy8mQfXB9e9ThzgTMzf7%2BL7%2B2RcFLlZy9onBMXQUPiRcVDAeZk%2FJnyrqIWX1s3Z9dXN3fevt2c3348vz78c351fXRIiwyMS2cYhAidsdiJycnVxdUN4DI8HY55xfABJnNv4uPr4%2B9nJHQGCAIgTGgcIkNu5FZDrs5vVHvOdbzW%2FESgIoPjMNFA8KrMfJM1vm%2BVDdy%2FL46X5eaDo2RC3DkEd4wQ8z9JdPQY15kWmolMIOERgmsbjAo0v8fLx6inJ4nyhUiIHivplXljqgUmgEhxfF0m2MjCBgSOLGheOemBGKAhG0dyAyEAhw8D4E0wOBck4nk9mtJ%2FgwbFniIoJR9fEogqOsyyjrQSHCccKjGMCkEZ%2Fr7fMmeRP6XmUO4rFXf7Ev6TjZHqXrk4rh3%2FwzSXNDzRFPmneuX5RnGnEV%2Fx4llv6oXi01pibjdjCYMuxjGNLllUbJ90WBHqb6hTZ%2FG5grTJm3neuRyQaj1aKqhhPU%2B9GLFrvNDpSRqz1JPDoiCQCSCrbwy8Uq2xzHCKj3YsEPKnMB3NHa56Bgg8MEPj%2BsBcIiC7Al0XTD2U4OplP1n36FkQEBhGeA%2Fp6nUCAcmhV6rraEogFDBYC3zgWukvgf1v9KwgGDBiiyDgYuhTPeDw%2BbJxZR%2BJjogOBDiaFlPrx6JI9s2TGH%2F7xlOJKHBxczzgcuoTOLHnKnw%2FBgAKDHxoHg6xwNhLGDVKh%2Fk3zFfmPIDKzuwYseuIMqGfAok%2FDkQYRofwtw5G2D1iEQcAzPFjavg4ouYc4hIaZnM9Ws06sySifm5a%2FAkeere5tyzSdLidPtOcgwNVjSCMIF%2BLkvQCUOMWIimTl8Mvuf8W%2Fstb%2Br%2FgnEikIpPSY0aicFChv1J8WD6L4fTSNFwv%2BSXmFWv1%2BYOfXOs5HcdNqTiDjsiPXqv%2F3rq%2FT3NCym4GME8hhrdhQ6tx4nvQc0DiyKZAZIpAJNsAgamJlsvuAIOZ4Yxgekkl3cyCnyY%2F4ebpcZ3cY5Uve9yHIYe2reHHHUUPGdaDh4nhH4oDGyg%2FjLLpHQrtyeAFbGs%2FQoC4qrffDjmStZjZXPc%2BLQlQEZjw5sgCZEfMFMKCB1NPddpTfV2zRNjJYRpcvdoOubaS6Ple1jQS0jQyyjfi7biOwpfEMDbYHLRb5IRA9WrP8d9ofEGAA9gcQBsz9AZJOd9wfbkcZ952mXcC8600iDJw%2Be4Q4sSraI0IqiB9mj%2BiepQvtEaCl8QwNFsDXFvqhCAqt1ROn3QEBA2h3gDBA3B1CW%2BKgXY36uf63GeL6bXbkc4dZ%2B9873goYY6LlVVXEDGRiuDYQOESB13gSeMplKCuXtYG6k2w05V7gmTqK7%2BUoimXY0e1Awr0XHeI1DBzgXp%2FrGWkEAxIMrtOCQT8LXSPXn9Lp60M6JxyQcPA943DoGr2e8Yginj%2FQZoEGRBgYBwTc0LMAYvHfZ%2F4jEw1INDArMg4HuH9ngcM9f41gwILBaQWS8owJ5TDAvTrFZjEmFrBY8BzTWIiAKewVC6%2F8j0h%2FEQ5YOLSEBBNwAOrNKxwesiShQwUaDVFgHA2yUlmPGuLR30QDmvwUGUdDpxr5GpNrQIPBNS6GjLq0yB%2FPo8fFJCYesHjwHegGQicOXXLkNP6ZzMd5C17iAYeHELyR0slDlx45i7OU1Gk0GvIemobR0CVGVhdXVbtdggIBCjsyDYouSXL0nP0kTRINBo%2BZBgMsSV5MFsvCnra1fH0qzU1EDE9EYFhE6ViwMJkTUdsoVlTQxoFJRmRYbOlYTLIzJcwi5LywvcJItPxZR9SYQ11x5dRJ6l6FAoVtnDfoGgE0mY%2ByZJbUzharmDLJDqF9hIjBIMY17DTqWGCnzPLc0TiIEiXKKPENO546VlfDzMqvrExb9yn10wqRgkFKZNjZ1bHAXpo1f1KMniM6FNDhMePOsbL2CfiRInatO5JGNDsZETSI0DjGBbVgOXnNpdQGFxIsamHxjItnwUad9e3mIVneCfWUzsUoVASmxa9M1k%2FrwyFO1tWDRARKjZBlWpzKwPrziogLcQ9LPKDwYJsWmTJQT614uK4VERISKEi4psWdrHui0E2jkJCgQIHCNy2%2BZB16KYfidl1MSESgEBEaF1uC2mhFxEdRT0g8YPAQMOMiyw4FdLVtjAkHPBwc4wJLUPKscPi2riokIlCI8IyLKzv0TE7E56qwkIBAASIwLqYENctaBCFqCwkIFCAi00JKe4tcKcoLiQeU%2FjW2aSGl3S1WfqpVGBISKEi4poWV4o%2FepF%2FXqwyJCRQmfNMCS7tbsPyyrjQkIlCICE2LLO1utfJCqjYkMDDAiCzjIsxu0fKkqjgkIFCAcIwLMUHVsp3yXebOkLvApcMzLtqURcyi1Ogsy9LsPM%2FTfMqSvNN6GwedPdrdg3fck91hbqkCVLWHIretPn%2FWBcZH2mLbxyABLlTPvQLHIEtWGBwUKZfkG3b3DeVS2%2BgbbNkZwAwgIgCXp99xm67KgvjvZPnhLe%2BG2i3vwGXo1dj6cbIYZZMnqj7HIUAMbdZJAJWbD1Fuvs3SkdwkG7Q0Xn25A%2BqLcNB3uGH3P5F2hZMN3oKOEQgQMUt%2FrOCAkqTES3mupOMkCge2AZEDKEQK55Cbn39I5kcxv2dA2ADKjdVOwO1%2Fut4MCAMUDIKeMQUmBqDIWGGwTIsPCQAU5UA0EdMJAJQM2ZwFfDZ%2FniVZKThvnAi837vacYc5WiU%2F3L9nrdITSc%2BVVhHKE2aZuHSqw8bEQQODNlmrvDj78%2Fzk6pL8yx7%2BxdlZnwItjuleZGXy9tvl3fHJ3fkJmXx4kwOClGqTu7IkeXv25fiSLI5icUCYUm5xkiAHkSC3WJrZcrgI7%2BB4G7gri5Bf4uXj1VMV6pkTwdnuUegFzLXFr%2B86ouPHxbAR0TmRI%2FPgiu6zDR5Cu%2FkkfDw%2B4CE8dc2ZLqL28Q3Fwuu4hJZY74WGcB8YKMAjePIEppbLoNQEJCrcCFz3OqHwKFQYIlTYYvjA3cvweJeXLqgzNvzAYWuTOOlwFiRHIkCzIUrQ6S3ASu3WHRXdTqDQwKzAOBzAMm3IR9DtNSYZjnmOAqzXpmssNTx4xnkKDyrX3ud%2BCnAu5ggcTnjEn%2BE71jSsULqlCoBbKs%2BX4WGed4QJkFzffXx6en53TjdVe7mQYkFudCEFyb0Mb%2BOJVyItp35z8fXj3U1%2BW0V2x7C77xphd1m0%2FPL14u78%2BuL85JhMj2P6yDLC9LJIeXr%2Bx%2FktGR3F6Iz5RlidVMhBVMht1nbt3tYWrX0xrC1rj1WpxO0rD5u59VYFFCbF9rbzvmP7MBBFieKGyvfkYtnQtoGFH7qooT087bt4vLn5V7%2BT79%2FdG%2Fid3qAguh8BiM4ArpaupKJ5PEvukmw2mfNlSRQMToELBgDKKYALpotuK%2FPn2X2SEQR4EPiRCRD4W2qnp8lLMovJ%2FsPbPwLjQuX2lzW%2BtRNYnQfI9IObnjHPCNvLUt%2Fa9jxGfp7NaeVjmB9WepWb35GMSwIAgrV91tvaeLlHPljpDEsAh61jYKM9QvNscLIxYGy8SUQR628vtpaTtruhu2kUAs0INburrcdUao2MgSERp6xEfqgg4L7o5yR9XhQ5bYVrmIwJBwwpypAgFFAi15tNOrvPkttvXwgFXFXSjIAUkCVFdDBfGSoPTUo0%2BDMiFjBY2CFcxWRBFif%2FmCS%2FFl%2BS%2BbNkdp1XVPaRF4Z52kzkMhb47%2Fm6KnCbt1WBJycxeqJXRp0DJwobTyFAwyKA5cpPk2ner%2Bt5kWTFh%2BQXdvYLxYrb7Bck0HuhgegiAli6PM6y%2BDVPWV2dMhuNwomKoalwPeOosCU7k6o1vOH9cC%2FD4wlcAdjSsYoZSFLAoCDwjVv%2BoM75M%2BVvs62%2FPj7ziGl%2Bkj7xIOF4lK%2B5a26KNJsl48O%2F4p%2FxUfxreZT85E%2FlqPjyWf4xf2fyc0kAIQAURcYBBKqUJUDTNB4XzYYXhVJ%2BPI%2Bnr%2F%2FkAyasuPowV7WL77rmh5L87%2FzJ3RDxg8APMzAsBau8awB9zuKnx%2BO5AIkY0s2QgUEsWPPd3MUuOEq0h5nAz56xMCY%2FYJF4k5%2Fb%2BCfFQEbwEzHj%2BAFLyZv8XCa%2FPlEYbQZCfA8zDaEQHBbeROjsZRXgXH4miEyAyAmMgwicMA5CdPqJIDIBIt%2BCroJ0MmRvZ6i6IyCGTGAodExjCOjoWRLEn8DkxyvJyxggOJZvGghAP88ShAU%2FT1HmIg4HdmQaB7JK%2FKFMQlgk02S0zD9ZJyvdp3yTueMgEB4YeHi2aXgAOa6lm0jm%2BfP9nccd6TzP8VmpwcnhfZpOk3i%2BYiOm2YNYpASeaaTISu%2Fvue84eUzThWGDy72jenPtgL3nXLd8FlDxnqooS5TD1Vv2ifLYRg5D6znYeHCEkv0pl2UPrxBuGUEmg90PBDzDg%2FprGWA8JMvbVYyRjFdRBu0UCEw4zn5MIDZsikBFtUiQXzymv04n8TR9ODxJZ0%2FcrquXy%2BfQLMaLn54ybqhC%2BaCgFAkgLzIPIFlNLaLPrMwxMCjWeOednxzXboYXYOcnV0wZVNj5KZLlUCBruvyJJqOr%2B7%2F4TkMOYg8HEW1ApLMVFIwE3vkjgmcVHf%2F4wQPNuyyeL3IlPP%2B7268QEUMTAbeFUk4EPLJoKxGX%2FP%2BpUxQGF3D5vnIuAMnzoNUYgmptEDGAy%2FeVY%2BBLtiVNYnhjb2gRBVobT4eIwDzU%2BqGB1AcU6xsSHHalkXIKfnBDZYfdRwfiA4MPQ0LFrjTRRbJsxYyHW2NIggUDFiPiR9fqSgjlsFzW48dDOKwkPjD4MCKwrKZjAXfmT%2FnzqHTtw1X8MRkt8rsQIgJDmtoh%2BMQkApAqSyIm88kaiAUFoTgCJdgVSjkFYGF%2FyUGWrHwDAYACANwKSjkAsiCZL%2F3J1Lj0mPd9YyVmgohJyCKxpWZ6OwJMz3znCO2%2ByrVg2TFPzH854uaePxz9nl9iH2dJzF9ff0j%2BYFd%2FUK60rjwZ2RuASOBdYrsWkFrZ5uF2lPFVk%2BtT%2BVfWnzGiYngqPGYCFYFkWlKlh7d1EPS1NZom7VqgKCkiAooEMeweGuH5QbVxUyDwkCzFZ8QEBhOMmeD4GdAQlDQCdRA4vXcETAhk6TBv%2FJf3%2FbsCJhjpbRf8rvMaw6pgpbpccCXze44jm99zfMS0RpcBWiF1BX77%2BmdbJCLw6gAEwLbxjA8kMdZupf1p%2FhRquUn%2BQ%2FFYqD8wNh8uONteOR9ASuOPYkzROn%2Ft8vjL2ffr48uzi%2B%2Bfb46vfzs%2FuSUihifCBzMXlBMBqIpdRNycXV%2Fd3BEPw%2FMQgpdMynkAVMUNPNxcfTs7IRQQUGDMMoIF0hIH0RK3WdvpHzviqYkMVBNrp0fSDVCM75qx1GVJsco5KpdULiISAygM%2BEYcHu3NCmLerTu3v3CvxAEKB6ERh0RbFhGr1l7LePr6e1EwTwyg6EiWEcdC8UdTnz%2FFKqIRh0AbkBGpuR%2B68T0jQkEb0Aipo58uJgIzQkNAJaRRUqYyE5kRRm5u%2FUiDW8wixmFmBJ3ABHQatWEsNHBVjHJogFnp1NPeYGx8M6LczYInjdMwEZvQiEDY2ayR0igfA7FxLSNiYWezpFo7PxVjLokbE7ixjYiIRYHphisZmsBrEjKuEfGws1m7pZm7BlITGBEOO5vH%2BdCcDp14wC1plOOxWf%2FNG67%2FXnTAa7QqIhwQcPCYGeGsLO2e52VCT1myTD5NHp4z%2Fpe2za%2Bz2Cg48g%2Feca2RF5QPvEoSkBBgni8j4DtHeLVmDmWHDpIdWiymjhtAYcNt1sbLDXXA3NAZfz7C5xcPj%2F%2Fl2cOCPD8CBo7XFwNMDmTRtEwGM8rbu%2B%2FY13uhmKxZrf9A3vDFS3W7O3iu3rXI1Q%2Fi6reM%2B5UriCFDiwpfDEPLOuXt6%2Bw%2BNWskznte32EgxnBXd%2B%2By0YFoHnN127S6h1jd7pa0HGB1A4bGXN2yNMjXxcKsvhDvenFHfnNxs8gBJqtGape3S8t7kOXt7Lq8IUNjLm9ZpJP6zNNCH2Shu77vNHfxSMwPqx%2FPHMUrnSbSDLPSvV1XOmhpzKUuZ0que8HTGh%2BmD7Avhg93rXFxWle1xGkQ9jBLfMsgbHmJQ4bGXOGy1LZtFCkt9D0XuhuwHpu5q1Zz80hzG2al76y5gZZGXOqeLLrlRQ5Xz8unZ76KsySmwH2otc739OZVKnhCZ67awN0jBW6Qte7trMCBlsZc67IEdz6LH5LzK1riQ4lwTFxXdS3xIFS7wkmEG2aF7yzCQYbGXOCyCHeajp5n%2FAc7exklT2B%2FVVrq%2By31ILJ6LHUWWGrXOslww6z13WU4yNKYi12W4fLI%2FTKlw%2FlQS9y2rObhHN7NFa9wUuGGWeE7q3CqF7iswj0vElljHz1nP5Nxfe0dZ9kq7bA0eTIfi1fSp1UaIn%2BlXJ%2F8388%2FfZks%2Fyz%2FgPzjb7nxjjx%2F9Z38h6m%2Bln9SfNH2V8Z%2Bno9Xf%2FV6wSXjh6R7ufF%2FfPqcjZKOH56FoiaE%2FzgPSachyzUqGzJLpvFy8rP5r4HstHrrqlN97RtKQNd%2F8nX%2Bwto3MKcKt6r%2BWZHVMnvxh64hqP51b%2BHCl8uANXJhreYtrskwBQvH3rC%2B0bEQzWw3YNHjLY5TdsLGJkkW%2F95EkXgFxiZoYhM4JnLDQl%2BTO2E26%2BQGDQJbgmCUx2qTuUKXEjXZsAMT2dDmU2xfhBm9fYr0FmU%2BRRYZraOj%2FyOhlBvvIg8ORYDfDho%2F8pPCw8rs7aKN%2FAhTQ0pEtCK0bIe09%2BWp4E3RYrFKNp4Uyj%2BoNwdvDA19uWJW%2BZr12bsIA9wNhsNesk7QHQagrT9ZA%2FxXrL8NE%2FA0rT%2B5BlX9%2BrM7jmeubcoCtNiG2jLsBWhHzQyqHntm%2By3K9kxZylO0ZjeoQMMs2Q2G17Rk5TJS5Ut2feQptswwNHLP1KWosMBqjrVUtmfKStu%2FYf2FJq2%2FQFatFKw%2F6yiKakuwHbK6Rq4%2FO9QTszKn3epB0foTKZA1NpgExftafAXuxiw%2BWePpXnTjePE42ApkG1egoUErCzfFLugr0Na0AmXVRh0gYbDZRTtGhkjaVGLmWJoAkRUnZYA0Y%2BgWIK5tIiDaYmir6pejGhBZdxoOkPtpmqeN1AkpLiHHnyb5P7RiRObF97t2HNcUXsp8A%2FW8sMjp5KXHW3h4oUQmCWTVzQzE7KZLMlIJZ2G0oRgFl7Ao8jXtWLKoNhwtrZvuFg%2FvAAfbCjbIA8g4tIvXleEAtZFTgkM78cFMHhxPy5EnahdMKONB1vy6eRgy3cGrE9G6unFwM%2BsiIYSbewp2%2FFYbOuaXvcE2p1C136IKo1CWNc3AyPWMwcjRE9o6vt%2BNERoTspypNkHTa204CrOp%2BnOhL0PTd3d3L623qLoZFv361KHUil26Ts9WYApKmtSWyBLCel%2BSpHco26d2FXi3QDSexLN0Pr57nLRYchuHZrYfWa5jCFm6Nq%2FIcrrJQuNkV50Xz9kcuZGR%2B9bGZny4SIRRxPQgISu7SsOZwNaHRSjEK4PDGSdscqEsNsGUY3cBJNKZ1tEbEBZGmgBhuoJXTAV2N72%2BPANBd8ztwkZTcImsDSXo2ImzYbv1oCpcMBXaHXEp0g7glATXJ%2FdS5yVodbVSxous4CrJKLS70lWYiWzoK1wLXD1sRLIs%2B2%2Boggk3XOHqySoU5xGF4tSRZ29afG39GzW1Q6wok1M7nKrmQXGeRqRetCwuVWGfrM4l70KF42jrT%2BDpoUJWINGpcDZi0fYWzBQudHkLu4wf1XOhVHFsSUsdGjT2PXxg%2Bu2GF7lNYUnVXUW0ayopGhHNXJ0P1pGF6id2gWLjPDdsKDS1KYl2VRuxoGin6yBfVfUnwon0uIkw1NMHK9pVXhySCH3NL3bZOPTU3nuhaGytmohdFcS3VrY5m08dXmju1rFpxhAyFhbr3jq2v0OZfKS89aJ1FG5UNlQeYXdyL3qOsG4YdacMb3%2BHorONZylv1ci3ps3ydOumCzlDdBeQbD0gOd2lKdvfoQwkHVLrZk2tBVJkDEiuFvHE9XbtNSS9QxlI6rXZRuAc2R0gWaExIG2a9YALkhNG3Wep7e9QBpJ6Obd5AmtlhVkKb%2BV3AWlT40hkkOxox61NeocykNRmnJYHMzjOthvNBNAPbUKyMfjQ5gR%2Bc6NSdATzLOVZpyIBecN53mAytBzDnMDRcjj3LFkJRifD3UxGKxZGDWF2wUKT%2BOd4oaUHC6VycFmj8g6dhZZrI8dzHT1UKJaEO6MLdSHqenJRD0cRaQlRmRW2araVMaG09F%2B0qOqRheKgCik7MaGpa7PUvkoVE0xjHb%2FvHmwOKFzUNBRh6H5HWS1xZuS24kxVB1Nx96QFCY%2BQ6ECCiRRT1UjI6ukOSIgalPp8xFUVyuqFeh1Kz5FKflcDEFxVfidK9FzvRCzQRMmbau2Hp6Rrjp%2BD2sNhJ0r03N2EYashmTJK3qR7Dk5J0BmY4qoau1Ci52ImZIGeaxb2plzY4Snp7FyGq3LstONoiUuC0NGSQ%2B8xWRJVS0mX8NGOS8yhRM%2FdnG%2FpqcDxmFqFtOE42nWyjZZkyESIVjrGyh6eF%2Bq5e2UDq6NvaKLcBsQnQOqA%2BJoAGVgq3bENQ%2BPazWoR4qgkpHf9njZCLD2E2AMLp29wIVbbh3gKCRE9dgwmxNVEyMA66o4%2BpDF%2BqO1DXIWEeI7xhNiaCHmTrPpGQpoHXKvVg9BWGYeIUezmEuKItumqCRm4femOPiToSAxzG3EI8q1%2B1Ptwy9iGCXTIQpkTNC%2F1FXWp9OyB00h3JWRjNpBiwb0%2FIbalRSQLHU8TIQO3FdiRED%2FqSQhDFtv7E%2BJ6WirKQ8fRRMjAPQZ27VHZ0cTIU5xSuMtO42qRUUPbczop2f4ORXXpnj2w8LqritKRkxj6BnOlJcYNbeZ3coVGiVYxtiNLUWV7i922J113wZEeQHSKsa0RM1FXAIObn8bE9VkPF%2BJoIsTyOgnZ%2Fg5VW5OjU75t5Sm1m16oa%2BO%2BE1N6DtZBZOnxOiL71jhClDbi2oUQTQfroN24XRkh5si3nYQgtwTehRCmZV8KQl8TITrl2xYhTnOXcRUfrHfZafQcrAM%2F2PFgLb1DWfSiU%2FTtyrIuC4FN5UrLwTqocgVUex%2Bdwm%2BLkqhJicKD9U6AaCkSDhw%2F0AOIZt23b9sJcwDxtDQj8f2A6QFEq4Db8CBaG1TvxogWJ%2BJFviZGzMmlXQ%2FAK3tjtY%2FKqJ0fd4JEV3usoFvj3%2F4OZSGu1gzcTqwM3Zt8LXWEDrP1nK1drQm4XYN3nEjx5iTajpt7tG5HuKq8iJjkYQAk1lHUvDySticb%2Bf7I64%2BJnu1JimGUYaJTye30JSr3Gqd3ojbDHsLSmNA3jIn1ZtL2HcjFcENU1zP9DjmI9IxV8Vy9ibQe2%2BgEWrsE8n2f37vkSxMhrH2bo4wQvYm0ZrSl599pOiBBoCnY1CundkzlaQKCPPSR%2Bb3jTE2J1izy9Ajurt6E2HBjKn6bEOSMgf6EaMopYZGjiRC9ybBhx1GkebOLfBbZgRA9OSUsYpoI0duaoOusGhgJCAv1uJDA7U6GxQLEM6czQTHbbU3IeniJImV0B0r0TBFljq%2Bn5svTqow2KAla9ytmupHy3KMcEFtTUaCnVRNtAtJ0I81Y1TImVmV6ugIzFuop3PJMyW7VqJlHvdvf2JaWOxXbD0M9dOjVU8O%2BeqqLrKfuQogW%2F7GuwFRNiKl66pGnsLfJLoDoOermKcx6ANErqNqb5bJaQrNRhGgKQWwmRqyoJkSvoFqUaurvj7QDIa6nSVAN9MhlniyoIk%2FNa1U%2BNBKX25V5uE2RbJHXshULFvmhFiw8i7WOtyy0lXAhy6hquQg7uEDuKN%2BfCx4c6uHCldLZFXHhy%2BqpRi7qlb3428guXGjSOtzI7vYXfd6iaOsRBOtCqV0y0yAJX3zfhaZAj%2FjutgdXKPMysrg6ypJ4qZKOqIWHmX4m0HO763pt2V0VGbKoik9Gd680U8nQM6rTCTVFrL4sqCogo%2BEzNFZC7USGlgrMMHR8PWDIOqpuMAyNWnU1h%2FZbExm3Bq3yO1TFrLLkqi9mbasluPVRdtibI03zXxmLWLOVSHtMdI%2B3qGpd78vSLDJJ3Vc6CrMXdyFJ0xB65nh6Bo77yvXY7pQ0ZigXoZZOI3yDtGw9XCjXY8Uc6R5VecgVE84Osa2tpcqf2aEooFS8jQTK9diultDGcuF4WiJbxs%2FDTA8XmsVVr9n3rsVFiMtF75xEXfd6TjXbSvFZWBybCAsTr%2FUc1w%2F1YCGrqmqxaN3qWQpz3HfAwtFTBGFHodOJxfZ3qKrxDWQRVi1I%2Bm5tduFIT8mVHTBN7kVWYPEPL5vLvQ2lwmZadHkmJSeqokK5lmodORuPLsbGIuXkG9VYRFb3noNGhQZd1O7dGsIYKsrOh8qvakR5tWoqNMuikddFBW6JzC7H2UDLucVvN%2BjeFp9Kb1B0fScmdBly6dLshIksrosLDYOTF5mjZxJAqEFE7duuCnnLca2%2BpRHatDJfUyQSDtwCYKdzbOMaTm1ZhMuY4Ugwj7VyiQKn4Sh6vEMZRbLiagZFDm5jgP4UaSui8BjbmaL2EFhVFA3cS2AnilqjsRSqJ7tApKd1N3NCMecOhgiNiIH7B2w9I%2Fe988U9DO2yOek5DIVuq5Rzm1eR3qAs7B24wcBOGbGtG5%2FITK%2BiSWbxw1aX520MSW9QtjEN3INgJ4Y6RRnkTuH9GdIk4Hqet5sfkt6gjKGBuxTsxJDdwZBjykFL182z3xJktrqh1verunYOZXlYRVWYGYMpXHGy7dHdgiFjNPxgilCWbJlk1PxBXsT3yTR%2F0Mli8k98v%2FpS%2Fqin%2Besf49HfDysTnKTTNFtb%2B0c6X9aNG08nD9zmp9nk4ZE%2Fyo8%2Fk2w5GcXT4%2FL1ZfpUmS%2F%2FWvKy0YCdrMomKP%2BgD%2BWf1NsijUe%2B%2B%2FONZO1TxfOdJj%2Bgx3ufLpfpDPcJD%2FSA%2BadZmi7rvGfx0%2BOXdJw%2FprP%2FDw%3D%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E)
