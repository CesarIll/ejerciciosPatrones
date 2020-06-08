package ejercicios3.chainOfResponsabilities_2;

public interface Trabajador {
    void setNext(Trabajador trabajador);
    Trabajador next();
    void criteriaHandler(Persona p);
}
