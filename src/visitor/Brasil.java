package visitor;

public class Brasil implements IPais {
    @Override
    public void quePaisEs() {
        System.out.println("Estamos en el país de Brasil");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
