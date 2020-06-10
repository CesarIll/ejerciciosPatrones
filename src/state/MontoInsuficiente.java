package state;

public class MontoInsuficiente implements IState{
    @Override
    public void handle(int monto, int precio) {
        int dif=precio-monto;
        System.out.println("El monto Bs. " + monto + " no es suficiente para comprar el producto. Añada Bs. " + dif + " más.");
        System.out.println();
    }
}
