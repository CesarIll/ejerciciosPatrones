package ejercicios3.memento_1;

public class Originator {
    private BaseDeDatos state;

    public BaseDeDatos getState() {
        return state;
    }

    public void setState(BaseDeDatos state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
    }
}
