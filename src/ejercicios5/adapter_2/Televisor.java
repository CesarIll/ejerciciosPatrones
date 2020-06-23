package ejercicios5.adapter_2;

public class Televisor implements IArtefactosElectronicosEmpresa2 {
    private double costo;
    private int tiempoDeGarantia;

    public Televisor(double costo, int tiempoDeGarantia) {
        this.costo = costo;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    public double getCosto() {
        return costo;
    }

    public int getTiempoDeGarantia() {
        return tiempoDeGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo de este televisor es de Bs. " + costo);
    }

    @Override
    public void tiempoDeGaratia() {
        System.out.println("El timepo de garatntia de este televisor es de " + tiempoDeGarantia + " años");
    }
}
