package ejercicios5.adapter_2;

public class AdaptadorTelevisor implements IArtefactosElectronicosEmpresa1 {
    private Televisor televisor;

    public AdaptadorTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public void precio() {
        System.out.println("El precio de este televisor es de Bs. " + televisor.getCosto());
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("El tiempo de vida de este televisor es de " + (televisor.getTiempoDeGarantia()+2) + " años");
    }
}
