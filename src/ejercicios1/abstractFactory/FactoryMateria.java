package ejercicios1.abstractFactory;

public class FactoryMateria {
    enum materias {Matematicas, Lenguaje, Historia, Ingles}

    public static IMateria make(materias materia) {
        IMateria materiaEscogida;
        switch (materia) {
            case Matematicas:
                materiaEscogida = new Matematicas();
                break;
            case Lenguaje:
                materiaEscogida = new Lenguaje();
                break;
            case Historia:
                materiaEscogida = new Historia();
                break;
            case Ingles:
                materiaEscogida = new Ingles();
                break;
            default:
                materiaEscogida = new Matematicas();
                System.out.println("No se escogió correctamente una materia, así que por defecto se escogió Matemáticas.");
        }
        return materiaEscogida;
    }
}
