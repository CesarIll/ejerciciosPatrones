package bridge;

public class Dolar implements Moneda {

    @Override
    public double cambio(double monto) {
        return monto*6.97;
    }
}
