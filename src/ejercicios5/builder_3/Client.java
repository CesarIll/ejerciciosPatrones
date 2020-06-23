package ejercicios5.builder_3;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder pizzaHawaiana = new PizzaHawaiana();
        PizzaBuilder pizzaCarnivora = new PizzaCarnivora();

        director.setBuilder(pizzaHawaiana);
        director.buildProduct();
        Pizzas pizza1 = director.getBuilder();

        director.setBuilder(pizzaCarnivora);
        director.buildProduct();
        Pizzas pizza2 = director.getBuilder();

        pizza1.showData();
        pizza2.showData();
    }
}
