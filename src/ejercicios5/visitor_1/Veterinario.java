package ejercicios5.visitor_1;

import java.time.LocalDateTime;

public class Veterinario implements IVisitor {
    LocalDateTime fechaHora;

    @Override
    public void darReceta(Perro perro) {
        definirHora();
        if (perro.enfermedad == IAnimales.Enfermedades.Enfermedad1) {
            System.out.println("Veterinario: Se entrega esta receta al perro "+ perro.getNombre() + " para la enfermedad 1.");
        } else if (perro.enfermedad == IAnimales.Enfermedades.Enfermedad2) {
            System.out.println("Veterinario: Se entrega esta receta al perro "+ perro.getNombre() + " para la enfermedad 2.");
        } else {
            System.out.println("Veterinario: El perro "+ perro.getNombre() + " está sano, no necesita receta.");
        }
        System.out.println();
    }

    @Override
    public void darReceta(Gato gato) {
        definirHora();
        if (gato.enfermedad == IAnimales.Enfermedades.Enfermedad1) {
            System.out.println("Veterinario: Se entrega esta receta al gato "+ gato.getNombre() + " para la enfermedad 1.");
        } else if (gato.enfermedad == IAnimales.Enfermedades.Enfermedad2) {
            System.out.println("Veterinario: Se entrega esta receta al gato "+ gato.getNombre() + " para la enfermedad 2.");
        } else {
            System.out.println("Veterinario: El gato "+ gato.getNombre() + " está sano, no necesita receta.");
        }
        System.out.println();
    }

    @Override
    public void darReceta(Caballo caballo) {
        definirHora();
        if (caballo.enfermedad == IAnimales.Enfermedades.Enfermedad1) {
            System.out.println("Veterinario: Se entrega esta receta al caballo "+ caballo.getNombre() + " para la enfermedad 1.");
        } else if (caballo.enfermedad == IAnimales.Enfermedades.Enfermedad2) {
            System.out.println("Veterinario: Se entrega esta receta al caballo "+ caballo.getNombre() + " para la enfermedad 2.");
        } else {
            System.out.println("Veterinario: El caballo "+ caballo.getNombre() + " está sano, no necesita receta.");
        }
        System.out.println();
    }

    public void definirHora(){
        fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);
    }
}
