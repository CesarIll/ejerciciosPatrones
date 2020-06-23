package visitor;

public class Argentina implements IPais {
    @Override
    public void quePaisEs() {
        System.out.println("Estamos en el país de Argentina");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
