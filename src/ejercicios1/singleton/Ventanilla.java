package ejercicios1.singleton;

public class Ventanilla {

    private static Ventanilla ventanillaUnica;
    private Cajero cajeroActual;
    private int montoActual;


    private Ventanilla() {
    }

    private synchronized static void makeVentanillaUnica() {
        if(ventanillaUnica == null) {
            ventanillaUnica = new Ventanilla();
        }
    }

    public static Ventanilla getVentanillaUnica() {
        if (ventanillaUnica == null) {
            makeVentanillaUnica();
        }
        return ventanillaUnica;
    }

    public Cajero getCajeroActual() {
        return cajeroActual;
    }

    public int getMontoActual() {
        return montoActual;
    }

    public void logIn (Cajero cajero) {
        cajeroActual = cajero;
        System.out.println("El cajero " + cajero.getNombre() + " es el encargo de esta ventanilla.");
    }

    public void logOut() {
        cajeroActual = null;
        System.out.println("No hay un cajero loggeado.");
    }

    public void pagar(Estudiante estudiante, int monto) {
        if(cajeroActual == null) {
            System.out.println("No se puede pagar, no existe un cajero loggeado.");
        } else if ((estudiante.getMonto() - monto) >= 0){
            montoActual+=monto;
            estudiante.setMonto(estudiante.getMonto() - monto);
            System.out.println("Se retiró " + monto + " del estudiante " + estudiante.getNombre() + ", el monto actual de la ventanilla es: " + montoActual + " y el monto actual del estudiante es: " + estudiante.getMonto());
        } else {
            System.out.println("El estudiante no tiene suficiente dinero.");
        }
    }


}
