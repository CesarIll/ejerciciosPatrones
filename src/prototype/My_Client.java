package prototype;

public class My_Client {
    public static void main(String[] args) {
        ConcretePrototypePasaje pasaje = new ConcretePrototypePasaje();
        pasaje.setCosto(200);
        pasaje.setDestino("Santa Cruz");
        pasaje.setHorasDeVueloAprox(3);
        pasaje.setNumero_de_asiento("22A");
        pasaje.setNumero_vuelo(2245);
        pasaje.setOrigen("La Paz");
        pasaje.setPasajero(new Pasajero("Juan",2234672));

        ConcretePrototypePasaje pasaje2 = (ConcretePrototypePasaje) pasaje.clone();
        pasaje2.setPasajero(new Pasajero("José", 2342312));
        pasaje2.setNumero_de_asiento("22E");

        ConcretePrototypePasaje pasaje3 = (ConcretePrototypePasaje) pasaje.clone();
        pasaje3.setPasajero(new Pasajero("María", 2342312));
        pasaje3.setNumero_de_asiento("21C");

        ConcretePrototypePasaje pasaje4 = (ConcretePrototypePasaje) pasaje.clone();
        pasaje4.setPasajero(new Pasajero("Andrés", 2342312));
        pasaje4.setNumero_de_asiento("32D");

        ConcretePrototypePasaje pasaje5 = (ConcretePrototypePasaje) pasaje.clone();
        pasaje5.setPasajero(new Pasajero("Henry", 2342312));
        pasaje5.setNumero_de_asiento("20A");

        System.out.println(pasaje.getNumero_de_asiento());
        System.out.println(pasaje2.getNumero_de_asiento());
        System.out.println(pasaje3.getNumero_de_asiento());
        System.out.println(pasaje4.getNumero_de_asiento());
        System.out.println(pasaje5.getNumero_de_asiento());
    }
}
