



import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

class Test {

    Alumno alumno = new Alumno(3);
    Alumno alumno2 = new Alumno(4);
    Alumno alumno3 = new Alumno(5);

    Materia materia = new Materia(1);
    Materia materia2 = new Materia(2);
    Materia materia3 = new Materia(3);
    Materia materia4 = new Materia(4);

    List<Materia> materiasDeAlumno1 = new ArrayList<Materia>();
    List<Materia> materiasDeAlumno2 = new ArrayList<Materia>();

    List<Materia> materiasCorrelativasMat3 = new ArrayList<Materia>();
    List<Materia> materiasCorrelativasMat4 = new ArrayList<Materia>();

    Inscripcion inscripcion1 = new Inscripcion(alumno);
    Inscripcion inscripcion2 = new Inscripcion(alumno2);

    List<Materia> materiasAIncripcion = new ArrayList<Materia>();


    public void Inicializar(){
        materiasDeAlumno1.add(materia);
        materiasDeAlumno1.add(materia2);
        alumno.setMateriasAprobadas(materiasDeAlumno1);

        materiasDeAlumno2.add(materia2);
        alumno2.setMateriasAprobadas(materiasDeAlumno2);

        materiasCorrelativasMat3.add(materia);
        materiasCorrelativasMat3.add(materia2);
        materia3.setMateriasCorrelativas(materiasCorrelativasMat3);

        materiasCorrelativasMat4.add(materia);
        materia4.setMateriasCorrelativas(materiasCorrelativasMat4);

        materiasAIncripcion.add(materia3);
        materiasAIncripcion.add(materia2);

        inscripcion1.setMateriasAInscribirse(materiasAIncripcion);
        inscripcion2.setMateriasAInscribirse(materiasAIncripcion);

    }


    @org.junit.jupiter.api.Test
    @DisplayName("Una persona se puede anotar en cualquier materia que no tenga correlativas")
    public void TestsPuedeCursarMateria1() {
        this.Inicializar();
        Assertions.assertEquals(true, materia.puedeCursarla(alumno));

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Una persona que tiene las correlativas adecuadas puede anotarse en la materia")
    public void TestsPuedeCursarMateria2() {
        this.Inicializar();
        Assertions.assertEquals(true, materia3.puedeCursarla(alumno));

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Una persona que NO tiene las correlativas adecuadas No puede anotarse en la materia")
    public void TestsPuedeCursarMateria3() {
        this.Inicializar();
        Assertions.assertEquals(false, materia3.puedeCursarla(alumno2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Una persona que tiene todas las correlativas adecuadas de una inscripcion puede anotarse")
    public void TestsPuedeInscribirse1() {
        this.Inicializar();
        Assertions.assertEquals(true,inscripcion1.aprobada());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Una persona que no tiene todas las correlativas adecuadas de una inscripcion no puede anotarse")
    public void TestsPuedeInscribirse2() {
        this.Inicializar();
        Assertions.assertEquals(false,inscripcion2.aprobada());
    }

// No me lo toma como tests desde que lo copie y pegue para pasarlo al gitHub pero andaban todos.
}