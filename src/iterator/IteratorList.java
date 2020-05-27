package iterator;

import java.util.List;

public class IteratorList implements Iterator {

    private int position;
    private List<String> nombre;

    public IteratorList (List<String> nombre) {
        this.nombre = nombre;
        position = 0;
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
