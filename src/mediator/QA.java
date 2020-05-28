package mediator;

public class QA extends Colleague {

    public QA(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("QA " + super.name + ": Mensaje \"" + msg + "\" recibido.");
    }
}
