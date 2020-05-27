package iterator;

public class ListArray implements IAggregate{
    private int position;
    private String [] nombre;

    public ListArray(){
        this.position=0;
        nombre= new String[5];
    }

    public void add(String value){
        nombre[position]=value;
        position++;
    }

    @Override
    public IteratorArray iterator() {
        return new IteratorArray(this.nombre);
    }
}
