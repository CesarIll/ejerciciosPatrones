package bridge;

public class Ahorro implements Cuenta {

    Moneda moneda;
    double montoDepositado;

    public Ahorro(Moneda moneda, double montoDepositado) {
        this.moneda = moneda;
        this.montoDepositado = montoDepositado;
    }

    @Override
    public void montoTotal() {
        montoDepositado = montoDepositado + montoDepositado*0.02;
        double montoEnBolivianos = moneda.cambio(montoDepositado);
        System.out.println("El monto total es de Bs. " + montoEnBolivianos);
        System.out.println();
    }
}
