# Instrucciones para agentes — Herencia

Se aplica a todo el repositorio. Codex debe leer este archivo; con Claude u otra herramienta, incluirlo explícitamente si no lo carga automáticamente.

## Antes de cambiar archivos

Lee `README.md` y las seis clases de `Herencia/` antes de cambiar el modelo o los menús.

Comprueba `git status --short` y la rama. Conserva cambios ajenos y lee las instrucciones de cualquier subdirectorio afectado. Contrasta los documentos con el código: un plan o resultado antiguo no demuestra una función actual. Limita cada cambio al encargo recibido.

## Reglas del proyecto

- Las clases no tienen paquete; ejecuta `Emulador`, no `Herencia.Emulador`.
- No describas el ejercicio como emulador funcional ni inventes una jerarquía de herencia. `Marca` contiene juegos; `Juego` contiene las otras entidades.
- Conserva catálogos y comportamiento del menú salvo encargo explícito. No añadas ROMs, datos externos ni servicios.
- No conviertas una tarea documental en una migración a un gestor de build o una reescritura del modelo.

## Validación y entrega

Se necesita JDK 9+ por `List.of`. Usa la compilación explícita del README y prueba manualmente 1 → juego → 0 → 4. El programa no maneja entrada no numérica/EOF; no declares esas rutas válidas sin corregirlas y comprobarlas en otro cambio. No hay tests automatizados existentes. Nunca agregues `.class` ni `.build/` al commit.

En cambios solo de documentación, comprueba rutas, enlaces relativos y comandos contra los archivos reales; no hace falta repetir toda la suite si no cambia el comportamiento. No inventes pruebas ausentes ni marques como aprobado un comando que no ejecutaste. Informa comando, resultado y alcance pendiente.

Revisa el diff antes de hacer commit. No incluyas dependencias instaladas, archivos generados, datos personales, credenciales, cookies, tokens ni archivos de entorno privados. Mantén los documentos útiles existentes y actualiza el estado si cambia una decisión o una limitación. Los commits deben explicar el resultado y su validación; separa documentación y cambios funcionales.
