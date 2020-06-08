package ejercicios2.mediator;

import java.util.LinkedList;
import java.util.List;

public class SalaChat implements Mediator {
    List<Desarrollador> desarrolladorList = new LinkedList<>();

    @Override
    public void send(String msg, Colleague colleague, boolean global, String name) {
        if (global) {
            for (Desarrollador a : desarrolladorList) {
                if (a != colleague) {
                    a.receive(msg);
                }
            }
        } else {
            Desarrollador b = null;
            for (Desarrollador a : desarrolladorList) {
                if (a.name.equals(name)) {
                    b = a;
                }
            }
            if (b != null) {
                b.receive(msg);
            }

        }
    }

    public List<Desarrollador> getDesarrolladorList() {
        return desarrolladorList;
    }

    public void setDesarrolladorList(List<Desarrollador> desarrolladorList) {
        this.desarrolladorList = desarrolladorList;
    }
}
