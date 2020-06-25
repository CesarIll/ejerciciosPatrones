package decorator;

public class Client {
    public static void main(String[] args) {
        Banco cuentaBanco1 = new CuentaBanco(300, "Juan P.");
        Banco cuentaBanco2 = new CuentaBanco(750, "José M.");

        cuentaBanco1 = new Promocion(cuentaBanco1);


        cuentaBanco2 = new BancaPorInternet(cuentaBanco2);
        ((BancaPorInternet)cuentaBanco2).enable();
        cuentaBanco2 = new SeguroCuenta(cuentaBanco2);
        cuentaBanco2 = new Promocion(cuentaBanco2);

        cuentaBanco1.showData();
        cuentaBanco2.showData();
    }
}
