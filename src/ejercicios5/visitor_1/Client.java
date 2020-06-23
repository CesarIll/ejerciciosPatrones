package ejercicios5.visitor_1;

public class Client {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

        Perro perro1 = new Perro("Pluto");
        Perro perro2 = new Perro("Snuffles");

        Gato gato1 = new Gato("Campanita");
        Gato gato2 = new Gato("Pelusa");

        Caballo caballo1 = new Caballo("Silver Bullet");
        Caballo caballo2 = new Caballo("Hol Horse");

        perro1.definirEnfermedad(IAnimales.Enfermedades.Enfermedad2);
        perro2.definirEnfermedad(IAnimales.Enfermedades.Enfermedad1);
        gato1.definirEnfermedad(IAnimales.Enfermedades.Enfermedad2);
        gato2.definirEnfermedad(IAnimales.Enfermedades.Enfermedad2);
        caballo1.definirEnfermedad(IAnimales.Enfermedades.Enfermedad1);
        caballo2.definirEnfermedad(IAnimales.Enfermedades.Enfermedad2);

        perro1.accept(veterinario);
        perro2.accept(veterinario);
        gato1.accept(veterinario);
        gato2.accept(veterinario);
        caballo1.accept(veterinario);
        caballo2.accept(veterinario);
    }
}
