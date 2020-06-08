package chainOfResponsability;

public interface AgenteCredito {
    void setNext(AgenteCredito handler);
    AgenteCredito next();
    void criteriaHandler(Persona p, int monto);
}
