package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private Integer codMateria;
    private List<Materia> materiasCorrelativas;

    public Materia(Integer codMateria) {
        this.materiasCorrelativas = new ArrayList<Materia>();
        this.codMateria = codMateria;
    }

    public Boolean puedeCursarla(Alumno alumno){
       return alumno.getMateriasAprobadas().containsAll(materiasCorrelativas);
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }

    public void setMateriasCorrelativas(List<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }
}
