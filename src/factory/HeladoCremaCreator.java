package factory;

public class HeladoCremaCreator extends Creator {
    @Override
    public HeladoCrema factoryMethodHelado() {
        HeladoCrema hc = new HeladoCrema();
        hc.setForma("Redondo");
        hc.setTamano("Mediano");
        hc.setBase(new Base("Cono", "Cónico"));
        hc.setFruta(new Fruta("dulce", "durazno", 3));
        hc.setCrema(new Crema("Leche", 2));
        return hc;
    }
}
