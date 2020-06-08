package memento;

public class Memento {
    private Versionador state;

    public Memento(Versionador state) {
        this.state = state;
    }

    public Versionador getState() {
        return state;
    }
}
