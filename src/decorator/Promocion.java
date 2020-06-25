package decorator;

import java.util.Random;

public class Promocion extends NuevasFuncionalidades {
    public Promocion(Banco banco) {
        super(banco);
        System.out.println("Añadida la funcionalidad \"Promocion\"");
    }

    public void showData(){
        int x = new Random().nextInt(10);
        if (x % 2 == 0) {
            super.changeMonto(super.getMonto() * 2);
        }
        super.showData();
    }
}
