package templateMethod;

public class Director extends Persona {

    public Director(String nombre, int edad) {
        super(nombre, edad);
    }

    public void entrevista(){
        System.out.println("El director " + nombre + " está en una entrevista.");
    }
}
