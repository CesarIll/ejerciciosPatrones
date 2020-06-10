package state;

public class MaquinaDispensadora {
    private IState estado;

    public IState getEstado() {
        return estado;
    }

    public void setEstado(IState estado) {
        this.estado = estado;
    }

    public void pedirProducto(int monto, int precio){
        if (monto <= 0 || precio <= 0) {
            throw new IllegalArgumentException("No hay");
        }
        if(monto == precio) {
            setEstado(new MontoExacto());
        } else if (precio > monto) {
            setEstado(new MontoInsuficiente());
        } else {
            setEstado(new MontoSuperior());
        }
        estado.handle(monto, precio);
    }
}
