package ejercicios1.factoryMethod;

public class KitEscolarCreator extends Creator {
    @Override
    public KitEscolar factoryKits() {
        KitEscolar kitEscolar = new KitEscolar();
        kitEscolar.setMochila(new Mochila(3,"mediano"));
        kitEscolar.setDeportivo(new Deportivo("M", "azul", 2));
        kitEscolar.setCuaderno(new Cuaderno("anillado", 100));
        return kitEscolar;
    }
}
