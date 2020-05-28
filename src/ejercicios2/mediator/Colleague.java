package ejercicios2.mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg, boolean global);
    public abstract void receive(String msg);
}
