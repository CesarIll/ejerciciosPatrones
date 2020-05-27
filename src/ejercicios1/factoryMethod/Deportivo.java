package ejercicios1.factoryMethod;

public class Deportivo {
    private String talla;
    private String color;
    private int numeroPrendas;

    public Deportivo(String talla, String color, int numeroPrendas) {
        this.talla = talla;
        this.color = color;
        this.numeroPrendas = numeroPrendas;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPrendas() {
        return numeroPrendas;
    }

    public void setNumeroPrendas(int numeroPrendas) {
        this.numeroPrendas = numeroPrendas;
    }
}
