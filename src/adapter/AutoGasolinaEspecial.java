package adapter;

import java.util.Random;

public class AutoGasolinaEspecial implements IAutomovil {
    private int capacidad;

    @Override
    public void llenarGasolina(int capacidad) {
        if(capacidad < 0 || capacidad > 100)
            throw new IllegalArgumentException();

        this.capacidad = capacidad;
    }

    @Override
    public int estadoDelCombustible() {
        Random r = new Random();
        return r.nextInt(100)+1;
    }
}
