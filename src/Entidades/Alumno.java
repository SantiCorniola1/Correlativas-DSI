package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo ) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }


    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}
