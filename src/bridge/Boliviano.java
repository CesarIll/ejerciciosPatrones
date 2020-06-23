package bridge;

public class Boliviano implements Moneda {

    @Override
    public double cambio(double monto) {
        return monto;
    }
}
