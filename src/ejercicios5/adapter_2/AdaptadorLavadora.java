package ejercicios5.adapter_2;

public class AdaptadorLavadora implements IArtefactosElectronicosEmpresa1 {
    private Lavadora lavadora;

    public AdaptadorLavadora(Lavadora lavadora) {
        this.lavadora = lavadora;
    }

    @Override
    public void precio() {
        System.out.println("El precio de esta lavadora es de Bs. " + lavadora.getCosto());
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de esta lavadora es de " + (lavadora.getTiempoDeGarantia()+1) + " años");
    }
}
