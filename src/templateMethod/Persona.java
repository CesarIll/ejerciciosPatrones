package templateMethod;

import java.time.LocalDateTime;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected LocalDateTime hora;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        System.out.println("La persona tiene " + edad + " años");
        return edad;
    }

    public final String getTimeNombre() {
        hora = LocalDateTime.now();
        String s = hora + " " + nombre;
        System.out.println(s);
        return s;
    }

    public void showData(){
        System.out.println("Edad: " + edad);
        hora = LocalDateTime.now();
        System.out.println("Hora: " + hora);
    }
}
