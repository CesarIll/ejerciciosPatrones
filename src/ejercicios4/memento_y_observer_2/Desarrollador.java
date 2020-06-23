package ejercicios4.memento_y_observer_2;

public class Desarrollador implements ISuscriptores{
    private String nombreUsuario;

    public Desarrollador(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void update(String msg) {
        System.out.println(nombreUsuario+ ": Notificado con \"" + msg + "\"");
    }
}
