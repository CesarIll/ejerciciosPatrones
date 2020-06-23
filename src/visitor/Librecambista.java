package visitor;

import java.util.Scanner;

public class Librecambista implements IVisitor {
    private Scanner sc = new Scanner(System.in);
    private IPais pais;
    private double montoCambiado;

    @Override
    public void visit(Argentina argentina) {
        pais = argentina;
        argentina.quePaisEs();
        System.out.println("Se puede cambiar de dólares a pesos argentinos y viceversa.");
        cambiarMoneda();
    }

    @Override
    public void visit(Bolivia bolivia) {
        pais = bolivia;
        bolivia.quePaisEs();
        System.out.println("Se puede cambiar de dólares a bolivianos y viceversa.");
        cambiarMoneda();
    }

    @Override
    public void visit(Brasil brasil) {
        pais = brasil;
        brasil.quePaisEs();
        System.out.println("Se puede cambiar de dólares a reales y viceversa.");
        cambiarMoneda();
    }

    @Override
    public void cambiarMoneda() {
        System.out.println("Quiere cambiar a dolares?");
        boolean aDolares = sc.nextBoolean();
        System.out.println("Ingrese monto a cambiar");
        double monto = sc.nextDouble();
        if(pais instanceof Bolivia) {
            if(aDolares) {
                montoCambiado = monto/6.97;
                System.out.println("Se cambio a dólares");
                System.out.println("El monto cambiado es " + montoCambiado + " dolares");
            } else {
                montoCambiado = monto * 6.97;
                System.out.println("Se cambio a bolivianos");
                System.out.println("El monto cambiado es " + montoCambiado + " bolivianos");
            }
        } else if (pais instanceof Brasil) {
            if(aDolares) {
                montoCambiado = monto/5.23;
                System.out.println("Se cambio a dólares");
                System.out.println("El monto cambiado es " + montoCambiado + " dolares");
            } else {
                montoCambiado = monto * 5.23;
                System.out.println("Se cambio a reales");
                System.out.println("El monto cambiado es " + montoCambiado + " reales");
            }
        } else {
            if(aDolares) {
                montoCambiado = monto/69.57;
                System.out.println("Se cambio a dólares");
                System.out.println("El monto cambiado es " + montoCambiado + " dolares");
            } else {
                montoCambiado = monto * 69.57;
                System.out.println("Se cambio a pesos argentinos");
                System.out.println("El monto cambiado es " + montoCambiado + " pesos argentinos");
            }
        }
        System.out.println();

    }
}
