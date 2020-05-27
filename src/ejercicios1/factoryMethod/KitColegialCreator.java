package ejercicios1.factoryMethod;

public class KitColegialCreator extends Creator {
    @Override
    public KitColegial factoryKits() {
        KitColegial kitColegial = new KitColegial();
        kitColegial.setMochila(new Mochila(3,"mediano"));
        kitColegial.setLibro(new Libro("novela","Gabriel García Márquez"));
        kitColegial.setComputadora(new Computadora("Hewlett-Packard","Windows 10"));
        return kitColegial;
    }
}
