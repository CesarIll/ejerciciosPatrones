package chainOfResponsability;

public class Ayudante implements AgenteCredito {
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
        AgenteCreditoLocal a1 = new AgenteCreditoLocal();
        AgenteCreditoSucursal a2 = new AgenteCreditoSucursal();
        AgenteCreditoDepartamental a3 = new AgenteCreditoDepartamental();
        AgenteCreditoNacional a4 = new AgenteCreditoNacional();

        this.setNext(a1);
        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a4);

        this.next.criteriaHandler(p,monto);
    }
}
