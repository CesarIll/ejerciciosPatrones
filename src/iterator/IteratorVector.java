package iterator;

import java.util.Vector;

public class IteratorVector implements Iterator {

    private int position;
    private Vector<String> nombre;

    public IteratorVector(Vector<String> nombre){
        this.nombre=nombre;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.nombre.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.nombre.size() != 0 && position < this.nombre.size();
    }
}
