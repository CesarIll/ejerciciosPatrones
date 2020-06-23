package visitor;

public class Client {
    public static void main(String[] args) {
        Argentina argentina = new Argentina();
        Brasil brasil = new Brasil();
        Bolivia bolivia = new Bolivia();

        Librecambista librecambista = new Librecambista();

        argentina.accept(librecambista);
        bolivia.accept(librecambista);
        brasil.accept(librecambista);
    }
}
