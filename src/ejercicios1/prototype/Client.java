package ejercicios1.prototype;

public class Client {
    public static void main(String[] args) {
        Contrato contrato1 = new Contrato(5000,80,true,true,false,"08:00","18:00","Juan","Perez");
        contrato1.contrato();

        Contrato contrato2 = (Contrato) contrato1.clone();
        contrato2.setNombre("José");
        contrato2.setApellido("Tapia");
        contrato2.contrato();

        Contrato contrato3 = (Contrato) contrato1.clone();
        contrato3.setNombre("Marcelo");
        contrato3.setApellido("Quiroga");
        contrato3.contrato();

        Contrato contrato4 = (Contrato) contrato1.clone();
        contrato4.setNombre("José Arcadio");
        contrato4.setApellido("Buendía");
        contrato4.contrato();

        Contrato contrato5 = (Contrato) contrato1.clone();
        contrato5.setNombre("Aureliano");
        contrato5.setApellido("Buendía");
        contrato5.contrato();

        Contrato contrato6 = (Contrato) contrato1.clone();
        contrato6.setNombre("Brad");
        contrato6.setApellido("Pitt");
        contrato6.contrato();

        Contrato contrato7 = (Contrato) contrato1.clone();
        contrato7.setNombre("Luis Fernando");
        contrato7.setApellido("Choque");
        contrato7.contrato();

        Contrato contrato8 = (Contrato) contrato1.clone();
        contrato8.setNombre("Luis Fernando");
        contrato8.setApellido("Lopez");
        contrato8.contrato();

        Contrato contrato9 = (Contrato) contrato1.clone();
        contrato9.setNombre("Niko");
        contrato9.setApellido("Bellic");
        contrato9.contrato();

        Contrato contrato10 = (Contrato) contrato1.clone();
        contrato10.setNombre("Crash");
        contrato10.setApellido("Bandicoot");
        contrato10.contrato();

        Contrato contrato11 = (Contrato) contrato1.clone();
        contrato11.setNombre("Nathan");
        contrato11.setApellido("Drake");
        contrato11.contrato();

        Contrato contrato12 = (Contrato) contrato1.clone();
        contrato12.setNombre("Lara");
        contrato12.setApellido("Croft");
        contrato12.contrato();

        Contrato contrato13 = (Contrato) contrato1.clone();
        contrato13.setNombre("Elena");
        contrato13.setApellido("Fisher");
        contrato13.contrato();

        Contrato contrato14 = (Contrato) contrato1.clone();
        contrato14.setNombre("Bruce");
        contrato14.setApellido("Willis");
        contrato14.contrato();

        Contrato contrato15 = (Contrato) contrato1.clone();
        contrato15.setNombre("Juan");
        contrato15.setApellido("Topo");
        contrato15.contrato();

    }
}
