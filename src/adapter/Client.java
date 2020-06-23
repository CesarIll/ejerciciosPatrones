package adapter;

public class Client {

    public static void main(String[] args) {
        AutoElectrico autoElectrico = new AutoElectrico();

        IAutomovil autoDiesel = new AutoDiesel();
        IAutomovil autoGasolina = new AutoGasolina();
        IAutomovil autoGasolinaEspecial = new AutoGasolinaEspecial();
        IAutomovil adpaterAutoElectrico = new AdapterAutoElectrico(autoElectrico);

        System.out.println(autoDiesel.estadoDelCombustible());
        System.out.println(autoGasolina.estadoDelCombustible());
        System.out.println(autoGasolinaEspecial.estadoDelCombustible());
        System.out.println(adpaterAutoElectrico.estadoDelCombustible());
    }
}
