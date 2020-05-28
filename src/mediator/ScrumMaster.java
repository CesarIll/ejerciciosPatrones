package mediator;

public class ScrumMaster extends Colleague {
    public ScrumMaster(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Scrum Master " + super.name + ": Mensaje \"" + msg + "\" recibido.");
    }
}
