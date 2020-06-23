package visitor;

public interface IVisitor {
    void visit(Argentina argentina);
    void visit(Bolivia bolivia);
    void visit(Brasil brasil);
    void cambiarMoneda();
}
