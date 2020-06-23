package bridge;

public class Client {
    public static void main(String[] args) {
        Boliviano boliviano = new Boliviano();
        Euros euros = new Euros();
        Dolar dolar = new Dolar();

        Ahorro ahorro1 = new Ahorro(boliviano, 273);
        Ahorro ahorro2 = new Ahorro(euros, 100);
        Ahorro ahorro3 = new Ahorro(dolar, 400);

        PlazoFijo plazoFijo1 = new PlazoFijo(boliviano, 2384);
        PlazoFijo plazoFijo2 = new PlazoFijo(euros, 221);
        PlazoFijo plazoFijo3 = new PlazoFijo(dolar, 442);

        Credito credito1 = new Credito(boliviano, 23454);
        Credito credito2 = new Credito(euros, 283348);
        Credito credito3 = new Credito(dolar, 234234);

        ahorro1.montoTotal();
        ahorro2.montoTotal();
        ahorro3.montoTotal();

        plazoFijo1.montoTotal();
        plazoFijo2.montoTotal();
        plazoFijo3.montoTotal();

        credito1.montoTotal();
        credito2.montoTotal();
        credito3.montoTotal();
    }
}
