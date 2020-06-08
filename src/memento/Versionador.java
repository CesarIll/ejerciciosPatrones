package memento;

public class Versionador {
    private String codigo;
    private String state;

    public Versionador(String codigo, String state) {
        this.codigo = codigo;
        this.state = state;
    }

    public void showData(){
        System.out.println("Código: " + codigo);
        System.out.println("State: " + state);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
