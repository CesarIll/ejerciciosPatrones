package factory;

public class Fruta {
    private String tipo_fruta;
    private String nombre;
    private int costo;

    public Fruta(String tipo_fruta, String nombre, int costo) {
        this.tipo_fruta = tipo_fruta;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getTipo_fruta() {
        return tipo_fruta;
    }

    public void setTipo_fruta(String tipo_fruta) {
        this.tipo_fruta = tipo_fruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
