package chainOfResponsability;

public class AgenteCreditoSucursal implements AgenteCredito {
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
        if (monto > 10001 && monto <= 20000) {
            System.out.println("El agente de crédito de la sucursal se encargará de su préstamo.");
            Caja.getInstance().entregarPrestamo(p,monto);
        } else {
            next.criteriaHandler(p, monto);
        }
    }
}
