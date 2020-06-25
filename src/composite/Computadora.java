package composite;

public class Computadora extends Component {

    public Computadora() {
        super("Computadora", 100);
    }

    @Override
    public void vender() {
        System.out.println("Se vendio una computadora en Bs. " + getPrecio());
    }

    @Override
    public void add(Component component) {
        System.out.println("No se puede añadir nada a la computadora");
    }

    @Override
    public void remove(Component component) {
        System.out.println("No se puede quitar nada a la computadora");
    }

    @Override
    public void getChild(int position) {
        System.out.println("La computadora no tiene hijos");
    }
}
