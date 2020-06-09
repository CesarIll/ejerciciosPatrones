package strategy;

public class QuickSort implements IAlgoritmoOrdenamiento {

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        quickSort(estudiantes,0, estudiantes.length-1);
        return estudiantes;
    }

    public void quickSort(Estudiante arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(Estudiante arr[], int begin, int end) {
        int pivot = arr[end].getPromedio();
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].getPromedio() <= pivot) {
                i++;

                Estudiante swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Estudiante swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
