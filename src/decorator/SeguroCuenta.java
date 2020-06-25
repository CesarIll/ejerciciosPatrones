package decorator;

public class SeguroCuenta extends NuevasFuncionalidades {

    public SeguroCuenta(Banco banco) {
        super(banco);
        System.out.println("Agregada la nueva funcionalidad \"Seguro de la cuenta\"");
    }

    public void showData() {
        super.changeMonto(super.getMonto() - 70);
        super.showData();
    }
}
