package chainOfResponsability;

public class AgenteCreditoNacional implements AgenteCredito {
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
        System.out.println("El agente de crédito nacional se encargará de su préstamo.");
        Caja.getInstance().entregarPrestamo(p,monto);
    }
}
