package ejercicios5.builder_3;

public class Pizzas {

    String masa;
    String salsa;
    String tipoQueso;

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public void showData(){
        System.out.println("Masa: " + masa);
        System.out.println("Salsa: " + salsa);
        System.out.println("Queso: " + tipoQueso);
        System.out.println();
    }
}
