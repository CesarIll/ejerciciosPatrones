package ejercicios3.memento_1;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        BaseDeDatos baseDeDatos;

        baseDeDatos = new BaseDeDatos();
        baseDeDatos.añadirPersona(new Persona("Juan1", 23374633, 23));
        baseDeDatos.añadirPersona(new Persona("Juan2", 27363447, 14));
        originator.setState(baseDeDatos);
        careTaker.addMemento("Backup Junio",originator.createMemento());

        baseDeDatos = (BaseDeDatos) baseDeDatos.clone();
        baseDeDatos.añadirPersona(new Persona("Juan3", 28344459, 54));
        baseDeDatos.añadirPersona(new Persona("Juan4", 55847504, 24));
        baseDeDatos.añadirPersona(new Persona("Juan5", 29455834, 65));
        originator.setState(baseDeDatos);
        careTaker.addMemento("Backup Julio",originator.createMemento());

        baseDeDatos = (BaseDeDatos) baseDeDatos.clone();
        baseDeDatos.añadirPersona(new Persona("Juan6", 95484334, 32));
        baseDeDatos.añadirPersona(new Persona("Juan7", 29456587, 34));
        baseDeDatos.añadirPersona(new Persona("Juan8", 58372759, 54));
        originator.setState(baseDeDatos);
        careTaker.addMemento("Backup Agosto",originator.createMemento());

        baseDeDatos = (BaseDeDatos) baseDeDatos.clone();
        baseDeDatos.añadirPersona(new Persona("Juan9", 29345693, 15));
        baseDeDatos.añadirPersona(new Persona("Juan10", 28345737, 64));
        baseDeDatos.añadirPersona(new Persona("Juan11", 38234502, 32));
        originator.setState(baseDeDatos);
        careTaker.addMemento("Backup Septiembre",originator.createMemento());

        baseDeDatos = (BaseDeDatos) baseDeDatos.clone();
        baseDeDatos.añadirPersona(new Persona("Juan12", 28345737, 84));
        baseDeDatos.añadirPersona(new Persona("Juan13", 38234502, 23));
        originator.setState(baseDeDatos);
        careTaker.addMemento("Backup Octubre",originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento("Backup Julio"));
        originator.getState().showPersonas();

    }
}
