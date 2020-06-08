package ejercicios3.chainOfResponsabilities_4;

public class Teniente implements CuerpoDelEjercito{
    private CuerpoDelEjercito next;

    @Override
    public void setNext(CuerpoDelEjercito militar) {
        this.next = militar;
    }

    @Override
    public CuerpoDelEjercito next() {
        return next;
    }

    @Override
    public void criteriaHandler(ordenes orden) {
        if (orden == ordenes.Disciplina) {
            System.out.println("Teniente: \"Señor, me encargaré de la disciplina, señor!\"");
        } else {
            next.criteriaHandler(orden);
        }
    }
}
