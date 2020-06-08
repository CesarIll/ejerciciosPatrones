package ejercicios3.chainOfResponsabilities_4;

public class Coronel implements CuerpoDelEjercito{
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
        if (orden == ordenes.Desbloqueo) {
            System.out.println("Coronel: \"Señor, me encargaré del bloqueo, señor!\"");
        } else {
            next.criteriaHandler(orden);
        }
    }
}
