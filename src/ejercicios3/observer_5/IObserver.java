package ejercicios3.observer_5;

import java.util.LinkedList;
import java.util.List;

public interface IObserver {
    List<String> categorias = new LinkedList<>();
    void update(String msg);
}
