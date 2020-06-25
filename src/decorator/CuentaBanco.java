package decorator;

public class CuentaBanco implements Banco {
    private int monto;
    private String nombrePropietario;

    public CuentaBanco(int monto, String nombrePropietario) {
        this.monto = monto;
        this.nombrePropietario = nombrePropietario;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public void showData() {
        System.out.println("Nombre: " + nombrePropietario);
        System.out.println("Monto: Bs. " + monto);
    }
}
