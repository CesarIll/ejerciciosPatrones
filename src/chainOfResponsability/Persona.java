package chainOfResponsability;

public class Persona {
    private String nombre;
    private int ci;
    private int montoPrestamo;

    public Persona(String nombre, int ci, int montoPrestamo) {
        this.nombre = nombre;
        this.ci = ci;
        this.montoPrestamo = montoPrestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(int montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }
}
