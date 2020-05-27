package ejercicios1.abstractFactory;

public class Estudiante {
    private String nombre;
    private int codigo;

    public Estudiante(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan Perez",32182);
        Estudiante e2 = new Estudiante("Aureliano Bunedía",47345);
        Estudiante e3 = new Estudiante("José Miranda",73234);
        Estudiante e4 = new Estudiante("Andrea Diaz",21234);
        Estudiante e5 = new Estudiante("Paola Gutierrez",93234);

        Matematicas m = (Matematicas) FactoryMateria.make(FactoryMateria.materias.Matematicas);
        Lenguaje l = (Lenguaje) FactoryMateria.make(FactoryMateria.materias.Lenguaje);
        Historia h = (Historia) FactoryMateria.make(FactoryMateria.materias.Historia);
        Ingles i = (Ingles) FactoryMateria.make(FactoryMateria.materias.Ingles);

        m.inscripcion(e1);
        h.inscripcion(e2);
        l.inscripcion(e3);
        i.inscripcion(e4);
        h.inscripcion(e5);
    }
}
