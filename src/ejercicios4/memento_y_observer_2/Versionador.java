package ejercicios4.memento_y_observer_2;

public class Versionador {
    private String codigo;

    public Versionador(String codigo) {
        this.codigo = codigo;
    }

    public void showData(){
        System.out.println("Código: " + codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
