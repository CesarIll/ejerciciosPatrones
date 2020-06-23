package ejercicios5.adapter_2;

public class AdaptadorRefrigerador implements IArtefactosElectronicosEmpresa1 {
    private Refrigerador refrigerador;

    public AdaptadorRefrigerador(Refrigerador refrigerador) {
        this.refrigerador = refrigerador;
    }

    @Override
    public void precio() {
        System.out.println("El precio de este refrigerador es de Bs. " + refrigerador.getCosto());
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de este refrigerador es de " + (refrigerador.getTiempoDeGarantia()+10) + " años");
    }
}
