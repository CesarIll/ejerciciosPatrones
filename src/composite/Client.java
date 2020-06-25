package composite;

public class Client {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora();
        Computadora computadora2 = new Computadora();
        Computadora computadora3 = new Computadora();
        Computadora computadora4 = new Computadora();
        Computadora computadora5 = new Computadora();

        Composite laboratorio1 = new Composite("Laboratorio 1");
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);

        Composite laboratorio2 = new Composite("Laboratorio 2");
        laboratorio2.add(computadora3);
        laboratorio2.add(computadora4);
        laboratorio2.add(computadora5);

        Composite contenedeorComputadoras = new Composite("Contenedor de computadoras 1");
        contenedeorComputadoras.add(laboratorio1);
        contenedeorComputadoras.add(laboratorio2);
        contenedeorComputadoras.add(computadora2);

        laboratorio2.vender();
        contenedeorComputadoras.vender();

    }
}
