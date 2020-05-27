package iterator;

import java.util.Vector;

public class ListVector implements IAggregate{
    Vector<String> nombre;

    public ListVector(){
        nombre = new Vector<>();
    }

    public void add(String value){
        nombre.add(value);
    }

    @Override
    public IteratorVector iterator() {
        return new IteratorVector(this.nombre);
    }
}
