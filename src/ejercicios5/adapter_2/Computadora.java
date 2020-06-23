package ejercicios5.adapter_2;

public class Computadora implements IArtefactosElectronicosEmpresa1 {
    private double precio;
    private int tiempoDeVida;

    public Computadora(double precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void precio() {
        System.out.println("El precio de esta computadora es de Bs. " + precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de esta computadora es de " + tiempoDeVida + " años");
    }
}
