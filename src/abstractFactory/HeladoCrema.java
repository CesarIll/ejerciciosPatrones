package abstractFactory;

public class HeladoCrema implements IHelado {
    private String tamano;
    private String forma;
    private Base base;
    private Fruta fruta;
    private Crema crema;

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

    public Crema getCrema() {
        return crema;
    }

    public void setCrema(Crema crema) {
        this.crema = crema;
    }

    public void showData() {
        System.out.println("*******************************");
        System.out.println("Tamaño: " + tamano);
        System.out.println("Forma: "+ forma);
        System.out.println("Nombre de base: "+base.getNombre());
        System.out.println("Tipo de base: "+base.getTipo());
        System.out.println("Tipo de fruta : " +fruta.getTipo_fruta());
        System.out.println("Nombre de fruta : "+fruta.getNombre());
        System.out.println("Costo de fruta : "+fruta.getCosto());
        System.out.println("Sabor de crema: "+crema.getSabor());
        System.out.println("Costo de crema: "+crema.getCosto());
    }
}
