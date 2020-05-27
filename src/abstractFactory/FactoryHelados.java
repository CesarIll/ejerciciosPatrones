package abstractFactory;

public class FactoryHelados {

    public static IHelado make(String type) {
        @SuppressWarnings("heladoAgua")
        IHelado helado;

        switch (type) {
            case "heladoAgua":

                helado = new HeladoAgua();
                ((HeladoAgua)helado).setForma("Redondo");
                ((HeladoAgua)helado).setTamano("Mediano");
                ((HeladoAgua)helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoAgua)helado).setFruta(new Fruta("dulce", "durazno", 3));
                break;
            case "heladoCrema":
                helado = new HeladoCrema();
                ((HeladoCrema)helado).setForma("Redondo");
                ((HeladoCrema)helado).setTamano("Mediano");
                ((HeladoCrema)helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoCrema)helado).setFruta(new Fruta("dulce", "durazno", 3));
                ((HeladoCrema)helado).setCrema(new Crema("Leche", 2));
                break;
            case "heladoMixto":
                helado = new HeladoMixto();
                ((HeladoMixto)helado).setForma("Redondo");
                ((HeladoMixto)helado).setTamano("Mediano");
                ((HeladoMixto)helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoMixto)helado).setFruta(new Fruta("dulce", "durazno", 3));
                ((HeladoMixto)helado).setCrema(new Crema("Leche", 2));
                break;
            default:
                helado = new HeladoAgua();
                ((HeladoAgua)helado).setForma("Redondo");
                ((HeladoAgua)helado).setTamano("Mediano");
                ((HeladoAgua)helado).setBase(new Base("Cono", "Cónico"));
                ((HeladoAgua)helado).setFruta(new Fruta("dulce", "durazno", 3));
                break;
        }
        return helado;
    }
}
