package ejercicios1.abstractFactory;

public class Historia implements IMateria {
    @Override
    public void inscripcion(Estudiante e) {
        System.out.println("El estudiante " + e.getNombre() + " se inscribió a la materia de Historia");

    }
}
