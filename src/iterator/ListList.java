package iterator;

import java.util.LinkedList;
import java.util.List;

public class ListList implements IAggregate{
    List<String> nombre;

    public ListList(){
        nombre = new LinkedList<>();
    }

    public void add(String value){
        nombre.add(value);
    }

    @Override
    public IteratorList iterator() {
        return new IteratorList(this.nombre);
    }

}
