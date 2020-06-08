package ejercicios3.chainOfResponsabilities_2;

public class Cajero implements Trabajador {
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
        if (p.isTieneCertificadoDeNacimiento() && !p.isTienePagoAlBanco() && p.isTieneFicha()) {
            System.out.println("Cajero: Gracias por pagar!");
            p.setTienePagoAlBanco(true);
            Organizador organizador = new Organizador();
            organizador.criteriaHandler(p);
        } else {
            System.out.println("Cajero: Le faltan varios requisitos, le paso a Ayuda al ciente");
            AyudaAlCliente ayudaAlCliente = new AyudaAlCliente();
            ayudaAlCliente.criteriaHandler(p);
        }
    }
}
