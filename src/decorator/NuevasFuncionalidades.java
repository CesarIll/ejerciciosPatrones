package decorator;

public class NuevasFuncionalidades implements Banco {
    private Banco banco;

    public NuevasFuncionalidades(Banco banco) {
        this.banco = banco;
    }

    @Override
    public void showData() {
        this.banco.showData();
    }

    public void changeMonto(int x) {
        if (banco instanceof CuentaBanco) {
            ((CuentaBanco)banco).setMonto(x);
        }
    }

    public int getMonto() {
        if (banco instanceof CuentaBanco) {
            return ((CuentaBanco)banco).getMonto();
        } else {
            return 0;
        }
    }
}
