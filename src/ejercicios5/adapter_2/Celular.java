package ejercicios5.adapter_2;

public class Celular implements IArtefactosElectronicosEmpresa1 {
    private double precio;
    private int tiempoDeVida;

    public Celular(double precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void precio() {
        System.out.println("El precio de este celular es de Bs. " + precio);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de este celular es de " + tiempoDeVida + " años");
    }
}
