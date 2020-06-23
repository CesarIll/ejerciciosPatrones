package bridge;

public class Euros implements Moneda {
    @Override
    public double cambio(double monto) {
        return monto*7.76;
    }
}
