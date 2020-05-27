package factory;

public class HeladoAgua implements IHelado {
    private String tamano;
    private String forma;
    private Base base;
    private Fruta fruta;

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void showData() {
        System.out.println("*******************************");
        System.out.println("Tamaño: " + tamano);
        System.out.println("Forma: "+ forma);
        System.out.println("Nombre de base: "+base.getNombre());
        System.out.println("Tipo de base: "+base.getTipo());
        System.out.println("Tipo de fruta: " +fruta.getTipo_fruta());
        System.out.println("Nombre de fruta: "+fruta.getNombre());
        System.out.println("Costo de fruta: "+fruta.getCosto());
    }
}
