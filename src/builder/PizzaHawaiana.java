package builder;

public class PizzaHawaiana extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("Gruesa");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Tomate");
    }

    @Override
    public void buildQueso() {
        pizza.setTipoQueso("Cheddar");
    }
}
