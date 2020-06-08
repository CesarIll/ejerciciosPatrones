package ejercicios3.chainOfResponsabilities_2;

public class ResponsableDeCarnetizacion implements Trabajador {
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
        if (p.isTieneFicha() && p.isTienePagoAlBanco() && p.isTieneCertificadoDeNacimiento()) {
            System.out.println("Responsable de carnetización: Veo que tiene todos los requisitos. Vamos a sacar su carnet...");
        } else {
            System.out.println("Responsable de carnetización: Le faltan requisitos, le paso al notario");
            next.criteriaHandler(p);
        }
    }
}
