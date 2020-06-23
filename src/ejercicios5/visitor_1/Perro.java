package ejercicios5.visitor_1;

public class Perro implements IAnimales {
    protected Enfermedades enfermedad;
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.darReceta(this);
    }

    @Override
    public void definirEnfermedad(Enfermedades enfermedad) {
        this.enfermedad = enfermedad;
    }
}
