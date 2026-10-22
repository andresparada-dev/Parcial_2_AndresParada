# Comprensión del diseño — Enunciado C
**Nombre:** Andres Felipe Parada Orozco
**Fecha:** 19/10/2026

Responde con tus palabras, basándote en `docs/UML-final.md`. Respuestas
concisas (2–4 líneas por pregunta). Evidencia que entendiste el contrato
**antes** de programar.

---

### 1. Herencia y polimorfismo
¿Por qué `Curso` es una clase abstracta y no concreta? Menciona qué método
obliga a cada subclase a implementar y qué gana el sistema con eso.

> _Tu respuesta:_  Obliga a usar  método abstracto dificultadEsperada(), esto permite que configure a todos los cursos creados igual y sin tener que volver a configurarlos

---

### 2. Composición vs. agregación
Explica la diferencia entre `PlanEstudios ◆— Curso` (composición) y
`Facultad ◇— PlanEstudios` (agregación). ¿Qué pasaría con los cursos si se
elimina el plan? ¿Y con los planes si se elimina la facultad?

> _Tu respuesta:_ Si se elimina el plan se van a eliminar todos los cursos, pero si se elimina la facultad, los planes pueden seguir existiendo. Composicion se basa en que el contenedor o creador que en este caso es el Plan de Estudios, va a crear, guardar y almacenar en un arreglo los cursos, por esto si se elimina el contenedor se elimina el almacenado, mientras que en Agregación el contenedor solo utiliza a la otra clase pero si este se elimina no pasará nada con la otra

---

### 3. Asociación
En `Estudiante — Curso`, ¿quién es dueño de quién? ¿Por qué se modela como
N:M y no como composición?

> _Tu respuesta:_ Ninguno es dueño de otro, es decir, como un estudiante cursa varios cursos y un curso puede ser cursado por varios estudiantes entonces es solo referencia

---

### 4. Dependencia
¿Por qué `Recomendador` **depende** de `HistorialAcademico` en lugar de
**tenerlo** como atributo? ¿Qué ventaja tiene pasar el servicio como
parámetro?

> _Tu respuesta:_ Por que puede romper la dependencia, al ser usado como parámetro entonces se puede reutilizar y usar para varios estudiantes

---

### 5. Listas
En este proyecto se usan dos estructuras distintas:
- `int[] notas` en `Estudiante`
- `ArrayList<Curso>` en `PlanEstudios` y `Estudiante`

Explica por qué en cada caso se eligió esa estructura y no la otra. ¿Qué
pasa si el estudiante intenta registrar más notas que la capacidad del
arreglo?

> _Tu respuesta:_ Se usó un int[] notas por que la cantidad de notas es definida y limitada para el estudiante, se usó ArrayList<Curso> debido a que puede crecer la cantidad de cursos, si un estudiante registra más notas de la cantidad esta nota no se va a guardar, osea no se inclute