package Entidades;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class Inscripcion {
    private Alumno alumnoInteresado;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumnoInteresado) {
        this.alumnoInteresado = alumnoInteresado;

    }

    public void setAlumnoInteresado(Alumno alumnoInteresado) {
        this.alumnoInteresado = alumnoInteresado;
    }

    public void setMateriasAInscribirse(List<Materia> materiasAInscribirse) {
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public Boolean aprobada(){
        return materiasAInscribirse.stream().allMatch(materia->materia.puedeCursarla(alumnoInteresado));
    }
}
