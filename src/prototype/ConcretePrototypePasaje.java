package prototype;

public class ConcretePrototypePasaje implements IPrototype {

    private int numero_vuelo;
    private String destino;
    private String origen;
    private int horasDeVueloAprox;
    private String numero_de_asiento;
    private Pasajero pasajero;
    private int costo;

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getHorasDeVueloAprox() {
        return horasDeVueloAprox;
    }

    public void setHorasDeVueloAprox(int horasDeVueloAprox) {
        this.horasDeVueloAprox = horasDeVueloAprox;
    }

    public String getNumero_de_asiento() {
        return numero_de_asiento;
    }

    public void setNumero_de_asiento(String numero_de_asiento) {
        this.numero_de_asiento = numero_de_asiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }


    @Override
    public Object clone() {
        ConcretePrototypePasaje clone = new ConcretePrototypePasaje();
        clone.setPasajero(this.pasajero);
        clone.setOrigen(this.origen);
        clone.setHorasDeVueloAprox(this.horasDeVueloAprox);
        clone.setDestino(this.destino);
        clone.setCosto(this.costo);
        clone.setNumero_de_asiento(this.numero_de_asiento);
        clone.setNumero_vuelo(this.numero_vuelo);
        return clone;
    }
}
