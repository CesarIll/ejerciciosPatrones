package visitor;

public class Bolivia implements IPais {

    @Override
    public void quePaisEs() {
        System.out.println("Estamos en el país de Bolivia");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
