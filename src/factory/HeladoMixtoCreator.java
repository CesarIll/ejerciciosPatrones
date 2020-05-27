package factory;

public class HeladoMixtoCreator extends Creator {
    @Override
    public HeladoMixto factoryMethodHelado() {
        HeladoMixto hm = new HeladoMixto();
        hm.setForma("Redondo");
        hm.setTamano("Mediano");
        hm.setBase(new Base("Cono", "Cónico"));
        hm.setFruta(new Fruta("dulce", "durazno", 3));
        hm.setCrema(new Crema("Leche", 2));
        return hm;
    }
}
