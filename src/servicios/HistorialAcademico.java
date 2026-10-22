package servicios;

import personas.Estudiante;

/**
 * Historial académico derivado de un estudiante.
 * Se usa como DEPENDENCIA desde Recomendador.
 */
public class HistorialAcademico {

    private Estudiante estudiante;

    public HistorialAcademico(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /** Promedio del estudiante. */
    public double promedio() {
        // TODO: implementar
        return estudiante.promedio();
    }

    /** Cantidad de cursos inscritos. */
    public int cantidadCursos() {
        // TODO: implementar
        return estudiante.getInscritos().size();
    }

    public Estudiante getEstudiante() { return estudiante; }
}