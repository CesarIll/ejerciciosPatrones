package ejercicios3.chainOfResponsabilities_4;

public class Cabo implements CuerpoDelEjercito {
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
        if (orden == ordenes.Limpieza) {
            System.out.println("Cabo: \"Señor, haré la limpieza, señor!\"");
        } else {
            next.criteriaHandler(orden);
        }
    }
}
