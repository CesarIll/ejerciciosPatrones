package ejercicios3.memento_1;

import java.util.LinkedList;
import java.util.List;

public class BaseDeDatos implements Cloneable{
    private List<Persona> personas = new LinkedList<>();

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void showPersonas(){
        for (Persona p: personas) {
            System.out.println("Nombre: " + p.getNombre() + " | CI: " + p.getCi() + " | Edad: " + p.getEdad() + " años.");
        }
    }

    public void añadirPersona(Persona p) {
        personas.add(p);
    }

    @Override
    public Object clone(){
        BaseDeDatos newBaseDeDatos = new BaseDeDatos();
        List<Persona> newList = new LinkedList<>();
        for (Persona p : personas) {
            newList.add(p);
        }
        newBaseDeDatos.setPersonas(newList);
        return newBaseDeDatos;
    }
}
