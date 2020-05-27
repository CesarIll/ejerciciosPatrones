package factory;

public class Client {
    public static void main(String[] args) {
        HeladoAguaCreator creatorAgua = new HeladoAguaCreator();
        HeladoCremaCreator creatorCrema = new HeladoCremaCreator();
        HeladoMixtoCreator creatorMixto = new HeladoMixtoCreator();

        HeladoAgua heladoAgua1 = creatorAgua.factoryMethodHelado();
        HeladoAgua heladoAgua2 = creatorAgua.factoryMethodHelado();
        heladoAgua2.setFruta(new Fruta("dulce", "Manzana", 2));
        heladoAgua2.setBase(new Base("Vaso", "Vaso"));

        HeladoCrema heladoCrema1 = creatorCrema.factoryMethodHelado();
        HeladoCrema heladoCrema2 = creatorCrema.factoryMethodHelado();
        heladoCrema2.setFruta(new Fruta("dulce", "Frutilla", 2));
        heladoCrema2.setCrema(new Crema("Chocolate",3));

        HeladoMixto heladoMixto1 = creatorMixto.factoryMethodHelado();
        HeladoMixto heladoMixto2 = creatorMixto.factoryMethodHelado();
        heladoMixto2.setFruta(new Fruta("cítrico", "Limón", 2));
        heladoMixto2.setBase(new Base("Round", "redondo"));
        heladoCrema2.setCrema(new Crema("Frutilla", 3));

        heladoAgua1.showData();
        heladoAgua2.showData();
        heladoCrema1.showData();
        heladoCrema2.showData();
        heladoMixto1.showData();
        heladoMixto2.showData();
    }
}
