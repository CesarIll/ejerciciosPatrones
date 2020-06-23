package ejercicios5.adapter_2;

public class Client {
    public static void main(String[] args) {
        IArtefactosElectronicosEmpresa2 refrigerador = new Refrigerador(10000, 7);
        IArtefactosElectronicosEmpresa2 televisor = new Televisor(6500, 2);
        IArtefactosElectronicosEmpresa2 lavadora = new Lavadora(8000, 5);

        IArtefactosElectronicosEmpresa1 celular = new Celular(2100, 5);
        IArtefactosElectronicosEmpresa1 tablet = new Tablet(2450, 5);
        IArtefactosElectronicosEmpresa1 computadora = new Computadora(5600, 6);

        IArtefactosElectronicosEmpresa1 adaptadorRefrigerador = new AdaptadorRefrigerador((Refrigerador) refrigerador);
        IArtefactosElectronicosEmpresa1 adaptadorLavadora = new AdaptadorLavadora((Lavadora) lavadora);
        IArtefactosElectronicosEmpresa1 adaptadorTelevisor = new AdaptadorTelevisor((Televisor) televisor);

        celular.precio();
        celular.tiempoDeVida();

        tablet.precio();
        tablet.tiempoDeVida();

        computadora.precio();
        computadora.tiempoDeVida();

        refrigerador.costo();
        adaptadorRefrigerador.precio();
        refrigerador.tiempoDeGaratia();
        adaptadorRefrigerador.tiempoDeVida();

        lavadora.costo();
        adaptadorLavadora.precio();
        lavadora.tiempoDeGaratia();
        adaptadorLavadora.tiempoDeVida();

        televisor.costo();
        adaptadorTelevisor.precio();
        televisor.tiempoDeGaratia();
        adaptadorTelevisor.tiempoDeVida();
    }
}
