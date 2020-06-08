package ejercicios2.mediator;

public class Client {
    public static void main(String[] args) {
        SalaChat chat = new SalaChat();

        Desarrollador d1 = new Desarrollador(chat, "Juan1");
        Desarrollador d2 = new Desarrollador(chat, "Juan2");
        Desarrollador d3 = new Desarrollador(chat, "Juan3");
        Desarrollador d4 = new Desarrollador(chat, "Juan4");
        Desarrollador d5 = new Desarrollador(chat, "Juan5");

        chat.desarrolladorList.add(d1);
        chat.desarrolladorList.add(d2);
        chat.desarrolladorList.add(d3);
        chat.desarrolladorList.add(d4);
        chat.desarrolladorList.add(d5);

        d1.send("Estoy subiendo código", true, null);
        d2.send("Ëstoy tomando la tarea 1", false, "Juan3");
    }
}
