package ejercicios5.visitor_1;

public interface IAnimales {
    enum Enfermedades {Enfermedad1, Enfermedad2}
    void accept(IVisitor visitor);
    void definirEnfermedad(Enfermedades enfermedad);
}
