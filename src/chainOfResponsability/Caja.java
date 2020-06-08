package chainOfResponsability;

public class Caja {
    private static Caja cajaUnica = null;
    private int monto = 20000;

    private Caja(){}

    private synchronized static void makeInstance(){
        if (cajaUnica == null) {
            cajaUnica = new Caja();
        }
    }

    public static Caja getInstance(){
        if (cajaUnica == null) {
            makeInstance();
        }
        return cajaUnica;
    }


    public synchronized void entregarPrestamo(Persona p, int monto){
        if(this.monto >= monto) {
            p.setMontoPrestamo(p.getMontoPrestamo() + monto);
            this.monto = this.monto - monto;
            System.out.println("Se entregó Bs. " + monto + " a la persona " + p.getNombre() + " con CI " + p.getCi() + ".");
        } else {
            System.out.println("No se puedo entregar el monto del préstamo. La caja no tiene el monto suficiente.");
        }
        System.out.println("Saldo actual de la caja: " + this.monto);
    }

}
