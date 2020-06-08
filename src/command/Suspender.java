package command;

public class Suspender implements ICommand {
    private Receiver receiver;

    public Suspender(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.suspender();
    }
}
