package templateMethod;

public class Docente extends Persona {
    public Docente(String nombre, int edad) {
        super(nombre, edad);
    }

    public void preguntarTarea(){
        System.out.println("El docente " + nombre + " pregunta por la tarea.");
    }
}
