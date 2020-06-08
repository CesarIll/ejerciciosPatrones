package ejercicios3.chainOfResponsabilities_4;

public class Organizador implements CuerpoDelEjercito {
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
        General general = new General();
        Teniente teniente = new Teniente();
        Coronel coronel = new Coronel();
        Cabo cabo = new Cabo();

        this.setNext(cabo);
        cabo.setNext(coronel);
        coronel.setNext(teniente);
        teniente.setNext(general);

        this.next.criteriaHandler(orden);
    }
}
