package ejercicios3.chainOfResponsabilities_2;

public class AyudaAlCliente implements Trabajador {
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
        System.out.println("Ayuda al cliente: Necesita una ficha, un pago y un certificado de nacimiento. Espero haber sido de gran ayuda.");
    }
}
