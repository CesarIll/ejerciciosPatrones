package builder;

public abstract class PizzaBuilder {
    protected Pizzas pizza;

    public Pizzas getPizza() {
        return this.pizza;
    }

    public void createPizza() {
        pizza = new Pizzas();
    }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildQueso();

}
