package abstractFactory;

public class Client {

    public static  void main(String [] args){


        FactoryHelados.make("heladoAgua").showData();
        FactoryHelados.make("heladoCrema").showData();
        FactoryHelados.make("heladoMixto").showData();

        FactoryHelados2.make(FactoryHelados2.tipoHelado.HeladoAgua).showData();
        FactoryHelados2.make(FactoryHelados2.tipoHelado.HeladoCrema).showData();
        FactoryHelados2.make(FactoryHelados2.tipoHelado.HeladoMixto).showData();
    }
}
