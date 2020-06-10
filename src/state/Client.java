package state;

public class Client {
    public static void main(String[] args) {
        MaquinaDispensadora maquinaDispensadora = new MaquinaDispensadora();

        maquinaDispensadora.pedirProducto(30, 30);
        maquinaDispensadora.pedirProducto(50, 20);
        maquinaDispensadora.pedirProducto(20, 25);
    }
}
