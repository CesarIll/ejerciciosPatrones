package ejercicios3.chainOfResponsabilities_2;

public class Client {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();

        System.out.println();
        System.out.println("Primera persona");
        organizador.criteriaHandler(new Persona(false, false, false));
        System.out.println();
        System.out.println("Segunda persona");
        organizador.criteriaHandler(new Persona(false, false, true));
        System.out.println();
        System.out.println("Tercera persona");
        organizador.criteriaHandler(new Persona(false, true, false));
        System.out.println();
        System.out.println("Cuarta persona");
        organizador.criteriaHandler(new Persona(false, true, true));
        System.out.println();
        System.out.println("Quinta persona");
        organizador.criteriaHandler(new Persona(true, false, false));
        System.out.println();
        System.out.println("Sexta persona");
        organizador.criteriaHandler(new Persona(true, false, true));
        System.out.println();
        System.out.println("Séptima persona");
        organizador.criteriaHandler(new Persona(true, true, false));
        System.out.println();
        System.out.println("Octava persona");
        organizador.criteriaHandler(new Persona(true, true, true));
    }
}
