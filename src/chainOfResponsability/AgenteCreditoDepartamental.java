package chainOfResponsability;

public class AgenteCreditoDepartamental implements AgenteCredito {
    private AgenteCredito next;

    @Override
    public void setNext(AgenteCredito handler) {
        next = handler;
    }

    @Override
    public AgenteCredito next() {
        return next;
    }

    @Override
    public void criteriaHandler(Persona p, int monto) {
        if (monto > 20001 && monto <= 50000) {
            System.out.println("El agente de crédito departamental se encargará de su préstamo.");
            Caja.getInstance().entregarPrestamo(p,monto);
        } else {
            next.criteriaHandler(p, monto);
        }
    }
}
