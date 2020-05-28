package mediator;

public class Developer extends Colleague {

    public Developer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Developer " + super.name + ": Mensaje \"" + msg + "\" recibido.");
    }
}
