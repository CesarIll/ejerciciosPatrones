package bridge;

public class Credito implements Cuenta{

    Moneda moneda;
    double montoDepositado;

    public Credito(Moneda moneda, double montoDepositado) {
        this.moneda = moneda;
        this.montoDepositado = montoDepositado;
    }

    @Override
    public void montoTotal() {
        double montoEnBolivianos = moneda.cambio(montoDepositado);
        System.out.println("El monto total es de Bs. " + montoEnBolivianos);
        System.out.println();
    }
}
