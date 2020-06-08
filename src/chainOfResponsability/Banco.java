package chainOfResponsability;

public class Banco {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Ayudante a = new Ayudante();
                Persona jose = new Persona("Jose", 2237436, 0);
                a.criteriaHandler(jose,9000);
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Ayudante a = new Ayudante();
                Persona juan = new Persona("Juan", 3742644, 0);
                a.criteriaHandler(juan,22000);
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Ayudante a = new Ayudante();
                Persona maria = new Persona("Maria", 3732636, 0);
                a.criteriaHandler(maria,40000);
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Ayudante a = new Ayudante();
                Persona santiago = new Persona("Santiago", 21723364, 0);
                a.criteriaHandler(santiago,15000);
            }
        });

        thread.start();
        thread1.start();
        thread3.start();
        thread4.start();
    }
}
