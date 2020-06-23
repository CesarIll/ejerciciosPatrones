package templateMethod;

public class Client {
    public static void main(String[] args) {
        Persona estudiante = new Estudiante("juan", 19);
        Director director = new Director("jose", 34);
        Docente docente = new Docente("pablo", 43);

        estudiante.getTimeNombre();
        docente.preguntarTarea();
        director.entrevista();
    }
}
