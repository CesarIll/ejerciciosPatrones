package ejercicios3.observer_5;

public class Persona implements IObserver{

    public Persona(String[] args) {
        for (String arg: args) {
            categorias.add(arg);
        }
    }

    @Override
    public void update(String msg) {
        System.out.println("Notificacion: "+msg);
    }


}
