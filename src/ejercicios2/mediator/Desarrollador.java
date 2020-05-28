package ejercicios2.mediator;

public class Desarrollador extends Colleague {

    public Desarrollador(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg, boolean global) {
        mediator.send(msg, this, global);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Desarrollador " + super.name + ": Mensaje \"" + msg + "\" recibido.");
    }
}
