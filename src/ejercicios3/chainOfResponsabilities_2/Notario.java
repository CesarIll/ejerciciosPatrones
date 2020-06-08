package ejercicios3.chainOfResponsabilities_2;

public class Notario implements Trabajador {
    private Trabajador next;

    @Override
    public void setNext(Trabajador trabajador) {
        next = trabajador;
    }

    @Override
    public Trabajador next() {
        return next;
    }

    @Override
    public void criteriaHandler(Persona p) {
        if (!p.isTieneCertificadoDeNacimiento() && p.isTienePagoAlBanco() && p.isTieneFicha()) {
            System.out.println("Notario: Solo le falta certificado. Se lo saco...");
            p.setTieneCertificadoDeNacimiento(true);
            Organizador organizador = new Organizador();
            organizador.criteriaHandler(p);
        } else if (p.isTieneCertificadoDeNacimiento() && !p.isTienePagoAlBanco() && p.isTieneFicha()) {
             System.out.println("Notario: Veo que solo le falta pagar. Le paso con el cajero...");
             next.criteriaHandler(p);
        } else {
            System.out.println("Notario: Le faltan varios requisitos, le paso a Ayuda al ciente");
            AyudaAlCliente ayudaAlCliente = new AyudaAlCliente();
            ayudaAlCliente.criteriaHandler(p);
        }
    }
}
