package adapter;

import java.util.Random;

public class AutoElectrico {
    private int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void cargar(int capacidad) {
        if(capacidad < 0 || capacidad > 100)
            throw new IllegalArgumentException();

        if (capacidad%2 == 0) {
            this.capacidad = capacidad;
        } else {
            this.capacidad = capacidad+1;
        }
    }

    public int estadoElectricidad(){
        Random r = new Random();
        return r.nextInt(10)+1;
    }


}
