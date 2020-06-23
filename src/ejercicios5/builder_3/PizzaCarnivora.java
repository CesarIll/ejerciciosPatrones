package ejercicios5.builder_3;

public class PizzaCarnivora extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("Delgada");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Tomate");
    }

    @Override
    public void buildQueso() {
        pizza.setTipoQueso("Mozzarella");
    }
}
