package memento;

public class Originator {
    private Versionador state;

    public Versionador getState() {
        return state;
    }

    public void setState(Versionador state) {
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Creando memento...");
        System.out.println("Memento creado");
        state.showData();
        return new Memento(state);
    }

    public void restoreFromMemento(Memento m) {
        state = m.getState();
        System.out.println("Restaurando...");
        state.showData();
    }
}
