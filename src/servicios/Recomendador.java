package servicios;

import cursos.Curso;
import cursos.CursoElectivo;
import cursos.CursoNivelatorio;

import java.util.ArrayList;
import java.util.List;

/**
 * Recomendador que DEPENDE de HistorialAcademico.
 * Se pasa el historial como parámetro (no se guarda como atributo).
 */
public class Recomendador {

    /**
     * TODO estudiante:
     * Recibe un HistorialAcademico y retorna una lista de cursos recomendados.
     * Regla sugerida:
     *   - Si el promedio es >= 4.0, recomendar cursos electivos.
     *   - Si el promedio es < 4.0, recomendar cursos nivelatorios.
     * La lista puede estar vacía si no hay cursos disponibles.
     */
        // TODO: implementar
    public List<Curso> recomendar(HistorialAcademico historial) {
        List<Curso> resultado = new ArrayList<>();
        ArrayList<Curso> inscritos = historial.getEstudiante().getInscritos();

        for (int i = 0; i < inscritos.size(); i++) {
            if (historial.promedio() >= 4.0 && inscritos.get(i) instanceof CursoElectivo) {
                    resultado.add(inscritos.get(i));
            }
            if (historial.promedio() < 4.0 && inscritos.get(i) instanceof CursoNivelatorio) {
                    resultado.add(inscritos.get(i));
            }
        }
        return resultado;
    }
}
