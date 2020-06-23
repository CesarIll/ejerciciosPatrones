package templateMethod;

public class Estudiante extends Persona {

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    public void estudiar(){
        System.out.println("El estudiante " + nombre + " está estudiando.");
    }
}
