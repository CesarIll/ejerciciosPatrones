package ejercicios3.chainOfResponsabilities_4;

public interface CuerpoDelEjercito {
    enum ordenes{Entrevista, Disciplina, Desbloqueo, Limpieza}
    void setNext(CuerpoDelEjercito militar);
    CuerpoDelEjercito next();
    void criteriaHandler(ordenes orden);
}
