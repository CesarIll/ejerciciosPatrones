package strategy;

public class BubbleSort implements IAlgoritmoOrdenamiento{
    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        bubbleSort(estudiantes);
        return estudiantes;
    }

    void bubbleSort(Estudiante arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getPromedio() > arr[j+1].getPromedio())
                {
                    // swap arr[j+1] and arr[i]
                    Estudiante temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
