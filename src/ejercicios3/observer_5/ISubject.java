package ejercicios3.observer_5;

public interface ISubject {
    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver();
}
