package ejercicios1.singleton;

public class Estudiante {
    private String nombre;
    private int monto;

    public Estudiante(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public static void main(String[] args) {
        Ventanilla ventanilla = Ventanilla.getVentanillaUnica();
        System.out.println("El monto actual de la ventanilla es: " + ventanilla.getMontoActual());
        Estudiante estudiante1 = new Estudiante("Juan", 40);
        Estudiante estudiante2 = new Estudiante("José", 100);
        Estudiante estudiante3 = new Estudiante("Carlos", 320);
        Estudiante estudiante4 = new Estudiante("Aureliano", 50);
        Estudiante estudiante5 = new Estudiante("Maria", 150);

        ventanilla.pagar(estudiante1,50);

        ventanilla.logIn(new Cajero("Santiago", 32182));

        ventanilla.pagar(estudiante1, 50);
        ventanilla.pagar(estudiante2, 60);
        ventanilla.pagar(estudiante3, 100);
        ventanilla.pagar(estudiante4, 50);
        ventanilla.pagar(estudiante5, 75);



    }
}
