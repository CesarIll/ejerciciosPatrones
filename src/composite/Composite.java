package composite;

import java.util.LinkedList;
import java.util.List;

public class Composite extends Component {
    private List<Component> componentList = new LinkedList<>();
    private int precioTotal = 0;

    public Composite(String tipo) {
        super(tipo, 0);
    }

    @Override
    public void vender() {
        for (Component component : componentList) {
            precioTotal += component.getPrecio();
        }
        System.out.println("Se vendió " + getTipo() + " a Bs. " + precioTotal);
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
        setPrecio(getPrecio() + component.getPrecio());
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void getChild(int position) {
        componentList.get(position);
    }
}
