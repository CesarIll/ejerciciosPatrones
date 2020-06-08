package ejercicios3.chainOfResponsabilities_4;

public class Client {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();

        organizador.criteriaHandler(CuerpoDelEjercito.ordenes.Disciplina);
        organizador.criteriaHandler(CuerpoDelEjercito.ordenes.Entrevista);
        organizador.criteriaHandler(CuerpoDelEjercito.ordenes.Limpieza);
        organizador.criteriaHandler(CuerpoDelEjercito.ordenes.Desbloqueo);
    }
}
