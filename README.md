# Herencia — catálogo Java de videojuegos en consola

Ejercicio de modelado de objetos que permite elegir marca y juego para mostrar personajes, ítems y escenarios precargados. El programa se llama `Emulador`, pero no ejecuta ROMs ni emula hardware. Aunque el repositorio se llama Herencia, las clases actuales se relacionan principalmente por composición, sin jerarquías `extends` propias.

## Estructura y ejecución

Las seis clases sin declaración de paquete están en `Herencia/`: `Emulador` (entrada y menú), `Marca`, `Juego`, `Personaje`, `Item` y `Escenario`. Datos en memoria; solo biblioteca estándar, sin base de datos, Maven o Gradle. `List.of` requiere Java 9+; este mínimo se deduce del código.

Con un JDK que incluya `javac`, desde la raíz, en PowerShell:

```powershell
New-Item -ItemType Directory -Force .build
javac -encoding UTF-8 -d .build Herencia/Emulador.java Herencia/Marca.java Herencia/Juego.java Herencia/Personaje.java Herencia/Item.java Herencia/Escenario.java
java -cp .build Emulador
```

Menú: 1–3 elige marca; después un número de juego muestra detalles y 0 vuelve; 4 sale del menú principal. No se guardan cambios entre sesiones.

## Estado y siguientes pasos

Revisión del 2026-11-19 sobre `87b128b1e182375cc9a5e5609b3293f25338aae0`. Las observaciones del código se distinguen de las pruebas ejecutadas y de los informes históricos. Esta revisión solo modifica documentación.

Se revisaron las seis clases; no hay tests ni CI. No se compiló: no se localizó `javac` y el JRE 8 del entorno es insuficiente para `List.of`. Los comandos son instrucciones derivadas, pendientes de ejecución con JDK compatible.

`Scanner.nextInt()` no gestiona entrada no numérica ni EOF. Los catálogos están escritos en `main`; no hay interfaz gráfica ni emulación real. Próximos pasos propuestos: compilar, recorrer una marca/juego y salida 4, y plantear validación de entrada o separación de datos en cambios funcionales independientes.

[Instrucciones para agentes](AGENTS.md).
