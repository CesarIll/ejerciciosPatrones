package strategy;

public class InsertionSort implements IAlgoritmoOrdenamiento{

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        sort(estudiantes);
        return estudiantes;
    }

    private void sort(Estudiante arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Estudiante key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getPromedio() > key.getPromedio()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
