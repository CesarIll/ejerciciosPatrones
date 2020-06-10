package state;

public class MontoExacto implements IState {
    @Override
    public void handle(int monto, int precio) {
        System.out.println("Entregando el producto...");
        System.out.println();
    }
}
