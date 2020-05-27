package ejercicios1.factoryMethod;

public class Client {
    public static void main(String[] args) {
        KitEscolarCreator kitEscolarCreator = new KitEscolarCreator();
        KitColegialCreator kitColegialCreator = new KitColegialCreator();

        KitEscolar ke1 = kitEscolarCreator.factoryKits();
        KitColegial kc1 = kitColegialCreator.factoryKits();

        ke1.showData();
        kc1.showData();
    }
}
