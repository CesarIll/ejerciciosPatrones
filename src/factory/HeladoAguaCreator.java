package factory;

public class HeladoAguaCreator extends Creator{
    @Override
    public HeladoAgua factoryMethodHelado() {
        HeladoAgua ha = new HeladoAgua();
        ha.setForma("Redondo");
        ha.setTamano("Mediano");
        ha.setBase(new Base("Cono", "Cónico"));
        ha.setFruta(new Fruta("dulce", "durazno", 3));
        return ha;
    }
}
