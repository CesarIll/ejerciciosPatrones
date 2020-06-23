package ejercicios4.memento_y_observer_2;

public class Memento {
    private Versionador state;

    public Memento(Versionador state) {
        this.state = state;
    }

    public Versionador getState() {
        return state;
    }
}
