package ejercicios4.memento_y_observer_2;

public class Client {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

        Desarrollador desarrollador1 = new Desarrollador("Duck");
        Desarrollador desarrollador2 = new Desarrollador("Googleador");
        Desarrollador desarrollador3 = new Desarrollador("KingOfCommits");

        repositorio.attach(desarrollador1);
        repositorio.attach(desarrollador2);
        repositorio.attach(desarrollador3);

        repositorio.commit("int x = 2", "Variable x setteada a 2");
        repositorio.commit("int x = 2; x = 23", "Variable x setteada a 23");
        repositorio.commit("int x = 2; x = 23; x++", "Variable x setteada a 24");
        repositorio.commit("int x = 2; x+= 4", "Variable x setteada a 6");
        repositorio.commit("int x = 2; x = x-3", "Variable x setteada a -1");

        repositorio.returnToCommit("Variable x setteada a 2");

        repositorio.deAttach(desarrollador1);
        repositorio.deAttach(desarrollador2);
        repositorio.deAttach(desarrollador3);

        Desarrollador desarrollador4 = new Desarrollador("RookieCommiter");
        Desarrollador desarrollador5 = new Desarrollador("SeekingKnowledge");
        Desarrollador desarrollador6 = new Desarrollador("IfYoThenTrue");

        repositorio.attach(desarrollador4);
        repositorio.attach(desarrollador5);
        repositorio.attach(desarrollador6);

        repositorio.returnToCommit("Variable x setteada a -1");
    }
}
