package composite;

public abstract class Component {
    private String tipo;
    private int precio;

    public Component(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void vender();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void getChild(int position);
}
