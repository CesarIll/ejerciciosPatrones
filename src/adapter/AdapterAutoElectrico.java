package adapter;

import java.util.Random;

public class AdapterAutoElectrico implements IAutomovil {
    private AutoElectrico autoElectrico;

    public AdapterAutoElectrico(AutoElectrico autoElectrico){
        this.autoElectrico = autoElectrico;
    }

    @Override
    public void llenarGasolina(int capacidad) {
        this.autoElectrico.cargar(capacidad);
    }

    @Override
    public int estadoDelCombustible() {
        return this.autoElectrico.estadoElectricidad();
    }
}
