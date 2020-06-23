package ejercicios4.memento_y_observer_2;

public class Originator {
    private Versionador state;

    public Versionador getState() {
        return state;
    }

    public void setState(Versionador state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreFromMemento(Memento m) {
        state = m.getState();
    }
}
