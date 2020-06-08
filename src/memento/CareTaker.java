package memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private Map<String, Memento> savedStates = new HashMap<>();

    public void addMemento(String msg, Memento memento) {
        savedStates.put(msg, memento);
    }

    public Memento getMemento(String msg) {
        return savedStates.get(msg);
    }
}
