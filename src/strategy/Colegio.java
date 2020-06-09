package strategy;

public class Colegio {
    private Estudiante[] estudiantes;
    private IAlgoritmoOrdenamiento algoritmoOrdenamiento;

    public void ordenar() {
        algoritmoOrdenamiento.ordenar(estudiantes);
    }

    public void printEstudiantes()
    {
        int n = estudiantes.length;
        for (int i = 0; i < n; ++i)
            System.out.println(estudiantes[i].getNombre() + " " + estudiantes[i].getPromedio());
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public IAlgoritmoOrdenamiento getAlgoritmoOrdenamiento() {
        return algoritmoOrdenamiento;
    }

    public void setAlgoritmoOrdenamiento(IAlgoritmoOrdenamiento algoritmoOrdenamiento) {
        this.algoritmoOrdenamiento = algoritmoOrdenamiento;
    }
}
