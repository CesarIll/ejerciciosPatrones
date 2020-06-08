package memento;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        Versionador versionador;


        versionador = new Versionador("int x = 5; x++;System.out.println(x);","State 1");
        originator.setState(versionador);
        careTaker.addMemento("First commit",originator.createMemento());

        versionador = new Versionador("int x = 5; x++","State 2");
        originator.setState(versionador);

        versionador = new Versionador("int x = 5","State 3");
        originator.setState(versionador);
        careTaker.addMemento("Deleted increment and print",originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento("First commit"));
    }
}
