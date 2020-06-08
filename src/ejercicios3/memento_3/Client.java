package ejercicios3.memento_3;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Documento documento;

        documento= new Documento("Nombre: Cesar Illanes");
        originator.setState(documento);
        careTaker.addMemento(originator.createMemento());

        documento= new Documento("Nombre: Cesar Illanes \t Código: 44925");
        originator.setState(documento);
        careTaker.addMemento(originator.createMemento());

        documento= new Documento("Nombre: Cesar Illanes \t Código: 44925 \n Tesis");
        originator.setState(documento);
        careTaker.addMemento(originator.createMemento());

        documento= new Documento("Nombre: Cesar Illanes \t Código: 44925 \n Tesis \n Índice");
        originator.setState(documento);
        careTaker.addMemento(originator.createMemento());

        documento= new Documento("Nombre: Cesar Illanes \t Código: 44925 \n Tesis \n Índice \n 1. Agradecimientos");
        originator.setState(documento);
        careTaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(3));
        originator.getState().showData();

    }
}
