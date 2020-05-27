package ejercicios1.factoryMethod;

public class KitColegial implements IKit {
    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showData() {
        System.out.println("Este kit colegial cuenta con:");
        System.out.println();
        System.out.println("Mochila: ");
        System.out.println(mochila.getTamano());
        System.out.println(mochila.getNumeroBolsillos());
        System.out.println();
        System.out.println("Libro:");
        System.out.println(libro.getTipo());
        System.out.println(libro.getAutor());
        System.out.println();
        System.out.println("Computadora:");
        System.out.println(computadora.getMarca());
        System.out.println(computadora.getOs());
        System.out.println();
    }
}
