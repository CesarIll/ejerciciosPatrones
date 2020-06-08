package ejercicios3.memento_3;

import java.util.LinkedList;
import java.util.List;

public class CareTaker {
    private List<Memento> versiones = new LinkedList<>();

    public void addMemento(Memento memento){
        this.versiones.add(memento);
    }

    public Memento getMemento(int index) {
        return  this.versiones.get(index - 1);
    }

}
