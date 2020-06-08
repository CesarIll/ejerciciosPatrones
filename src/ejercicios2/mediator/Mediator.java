package ejercicios2.mediator;

public interface Mediator {
    public void send(String msg, Colleague colleague, boolean global, String name);
}
