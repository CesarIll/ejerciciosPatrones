package ejercicios3.observer_5;

public class Client {

    public static void main (String [] argsss){
        CanalYoutube canalxD = new CanalYoutube("CanalxD");

        Persona persona1 = new Persona(new String[]{"Accion", "Aventura"});
        Persona persona2 = new Persona(new String[]{"Accion"});
        Persona persona3 = new Persona(new String[]{"Comedia", "Aventura"});
        Persona persona4 = new Persona(new String[]{"Aventura"});
        Persona persona5 = new Persona(new String[]{"Comedia", "Accion"});

        canalxD.attach(persona1);
        canalxD.attach(persona2);
        canalxD.attach(persona3);
        canalxD.attach(persona4);
        canalxD.attach(persona5);

        canalxD.subirNuevoVideo(new Video ("Video", "Video 1", "05:17", "Aventura"));

    }
}
