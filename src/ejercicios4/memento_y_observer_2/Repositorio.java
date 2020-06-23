package ejercicios4.memento_y_observer_2;

import java.util.LinkedList;
import java.util.List;

public class Repositorio implements ISubject {
    private List<ISuscriptores> suscriptores = new LinkedList<>();
    private CareTaker careTaker = new CareTaker();
    private Originator originator = new Originator();
    private Versionador versionador;

    public Versionador getVersionador() {
        return versionador;
    }

    @Override
    public void attach(ISuscriptores suscriptor) {
        suscriptores.add(suscriptor);
    }

    @Override
    public void deAttach(ISuscriptores suscriptor) {
        suscriptores.remove(suscriptor);
    }

    @Override
    public void notifyObserver(String version) {
        for(ISuscriptores suscriptor : suscriptores) {
            suscriptor.update("Se volvió a la versión " + version);
        }
    }

    public void commit(String codigo, String msg) {
        versionador = new Versionador(codigo);
        originator.setState(versionador);
        careTaker.addMemento(msg, originator.createMemento());
    }

    public void returnToCommit(String msg) {
        originator.restoreFromMemento(careTaker.getMemento(msg));
        versionador = originator.getState();
        notifyObserver(msg);
    }
}
