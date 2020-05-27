package abstractFactory;

import abstractFactory.FactoryHelados2.tipoHelado;

public class FactoryHelados2 {
    public static IHelado make(tipoHelado type) {
        IHelado helado;
        switch (type) {
            case HeladoAgua:
                helado = new HeladoAgua();
                ((HeladoAgua) helado).setForma("Redondo");
                ((HeladoAgua) helado).setTamano("Mediano");
                ((HeladoAgua) helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoAgua) helado).setFruta(new Fruta("dulce", "manzana", 3));
                break;
            case HeladoCrema:
                helado = new HeladoCrema();
                ((HeladoCrema) helado).setForma("Redondo");
                ((HeladoCrema) helado).setTamano("Mediano");
                ((HeladoCrema) helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoCrema) helado).setFruta(new Fruta("dulce", "durazno", 3));
                ((HeladoCrema) helado).setCrema(new Crema("Leche", 2));
                break;
            case HeladoMixto:
                helado = new HeladoMixto();
                ((HeladoMixto) helado).setForma("Redondo");
                ((HeladoMixto) helado).setTamano("Mediano");
                ((HeladoMixto) helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoMixto) helado).setFruta(new Fruta("dulce", "durazno", 3));
                ((HeladoMixto) helado).setCrema(new Crema("Leche", 2));
                break;
            default:
                helado = new HeladoAgua();
                ((HeladoAgua) helado).setForma("Redondo");
                ((HeladoAgua) helado).setTamano("Mediano");
                ((HeladoAgua) helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoAgua) helado).setFruta(new Fruta("dulce", "durazno", 3));
                break;
        }
        return helado;
    }

    enum tipoHelado {HeladoAgua, HeladoCrema, HeladoMixto}
}
