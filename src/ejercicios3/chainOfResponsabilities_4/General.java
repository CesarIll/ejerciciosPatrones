package ejercicios3.chainOfResponsabilities_4;

public class General implements CuerpoDelEjercito {
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
        if (orden == ordenes.Entrevista) {
            System.out.println("General: \"Con gusto atenderé la entrevista!\"");
        }
    }
}
