package ejercicios3.memento_1;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    private Map<String, Memento> backups = new HashMap<>();

    public void addMemento(String alias, Memento memento){
        this.backups.put(alias, memento);
    }

    public Memento getMemento(String alias) {
        return  this.backups.get(alias);
    }

}
