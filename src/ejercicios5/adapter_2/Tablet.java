package ejercicios5.adapter_2;

public class Tablet implements IArtefactosElectronicosEmpresa1 {
    private double precio;
    private int tiempoDeVida;

    public Tablet(double precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void precio() {
        System.out.println("El precio de esta tablet es de Bs. " + precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de esta tablet es de " + tiempoDeVida + " años");
    }
}
