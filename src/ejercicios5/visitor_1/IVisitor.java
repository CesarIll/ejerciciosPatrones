package ejercicios5.visitor_1;

public interface IVisitor {
    void darReceta(Perro perro);
    void darReceta(Gato gato);
    void darReceta(Caballo caballo);
}
