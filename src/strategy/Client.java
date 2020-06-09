package strategy;

public class Client {
    public static void main(String[] args) {

        Colegio colegio = new Colegio();
        Estudiante[] estudiantes = {new Estudiante("Juan1", 90), new Estudiante("Juan2", 76), new Estudiante("Juan3", 86), new Estudiante("Jose1", 34), new Estudiante("Jose2", 95)};

        colegio.setEstudiantes(estudiantes);
        colegio.setAlgoritmoOrdenamiento(new BubbleSort());
        colegio.ordenar();
        colegio.printEstudiantes();
        System.out.println();

        colegio.setEstudiantes(estudiantes);
        colegio.setAlgoritmoOrdenamiento(new InsertionSort());
        colegio.ordenar();
        colegio.printEstudiantes();
        System.out.println();

        colegio.setEstudiantes(estudiantes);
        colegio.setAlgoritmoOrdenamiento(new QuickSort());
        colegio.ordenar();
        colegio.printEstudiantes();
        System.out.println();
    }
}
