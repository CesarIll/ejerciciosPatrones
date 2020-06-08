package ejercicios3.chainOfResponsabilities_2;

public class Organizador implements Trabajador {
    private Trabajador next;

    @Override
    public void setNext(Trabajador trabajador) {
        this.next = trabajador;
    }

    @Override
    public Trabajador next() {
        return next;
    }

    @Override
    public void criteriaHandler(Persona p) {
        ResponsableDeCarnetizacion responsable = new ResponsableDeCarnetizacion();
        Notario notario = new Notario();
        Cajero cajero = new Cajero();
        AyudaAlCliente ayuda = new AyudaAlCliente();

        this.setNext(responsable);
        responsable.setNext(notario);
        notario.setNext(cajero);
        cajero.setNext(ayuda);

        next.criteriaHandler(p);
    }
}
