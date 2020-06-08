package ejercicios3.memento_3;

public class Originator {
    private Documento state;

    public Documento getState() {
        return state;
    }

    public void setState(Documento state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state = n.getState();
    }
}
