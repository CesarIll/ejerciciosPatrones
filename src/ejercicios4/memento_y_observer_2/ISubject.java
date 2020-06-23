package ejercicios4.memento_y_observer_2;

public interface ISubject {
    void attach(ISuscriptores suscriptor);
    void deAttach(ISuscriptores suscriptor);
    void notifyObserver(String version);
}
