package command;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Receiver {
    private Map<String, LocalDateTime> commandosRealizados = new HashMap<>();

    public void reiniciar(){
        System.out.println("Reiniciando...");
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("Sesión cerrada exitosamente a las " + fechaHora);
    }

    public void apagar(){
        System.out.println("Apagando...");
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("Computadora apagada a las " + fechaHora);
    }

    public void suspender(){
        System.out.println("Suspendiendo...");
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("Computadora suspendida a las " + fechaHora);
    }

    public void cerrarSesion(){
        System.out.println("Cerrando sesión...");
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("Sesión cerrada exitosamente a las " + fechaHora);
    }
}
