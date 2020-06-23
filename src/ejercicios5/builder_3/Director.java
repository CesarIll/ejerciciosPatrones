package ejercicios5.builder_3;

public class Director {
    private PizzaBuilder builder;

    public Pizzas getBuilder() {
        return builder.getPizza();
    }

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public  void buildProduct(){
        builder.createPizza();
        builder.buildMasa();
        builder.buildSalsa();
        builder.buildQueso();
    }
}
