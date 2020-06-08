package ejercicios3.memento_1;

public class Memento {
    private BaseDeDatos state;

    public Memento(BaseDeDatos state) {
        this.state = state;
    }

    public BaseDeDatos getState() {
        return state;
    }
}
