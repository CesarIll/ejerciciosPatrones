package ejercicios1.abstractFactory;

public class Lenguaje implements IMateria {
    @Override
    public void inscripcion(Estudiante e) {
        System.out.println("El estudiante " + e.getNombre() + " se inscribió a la materia de Lenguaje");

    }
}
