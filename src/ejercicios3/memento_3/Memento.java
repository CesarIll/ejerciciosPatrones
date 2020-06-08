package ejercicios3.memento_3;

import ejercicios3.memento_1.BaseDeDatos;

public class Memento {
    private Documento state;

    public Memento(Documento state) {
        this.state = state;
    }

    public Documento getState() {
        return state;
    }
}
