package ejercicios1.factoryMethod;

public class KitEscolar implements IKit {
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuaderno cuaderno;

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    @Override
    public void showData() {
        System.out.println("Este kit escolar cuenta con:");
        System.out.println();
        System.out.println("Mochila: ");
        System.out.println(mochila.getTamano());
        System.out.println(mochila.getNumeroBolsillos());
        System.out.println();
        System.out.println("Deportivo:");
        System.out.println(deportivo.getTalla());
        System.out.println(deportivo.getColor());
        System.out.println(deportivo.getNumeroPrendas());
        System.out.println();
        System.out.println("Cuaderno:");
        System.out.println(cuaderno.getTipo());
        System.out.println(cuaderno.getNumeroHojas());
        System.out.println();
    }
}
