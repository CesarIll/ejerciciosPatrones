package state;

public class MontoSuperior implements IState {

    @Override
    public void handle(int monto, int precio) {
        System.out.println("Entregando el producto...");
        int dif=monto-precio;
        System.out.println("Devolviendo Bs. " + dif + " de cambio.");
        System.out.println();
    }
}
