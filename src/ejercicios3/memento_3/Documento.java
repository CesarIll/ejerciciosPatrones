package ejercicios3.memento_3;

public class Documento {
    private String valor;

    public Documento(String valor) {
        this.valor = valor;
    }

    public void showData() {
        System.out.println(valor);
    }
}
