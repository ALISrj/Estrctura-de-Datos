package metodosordenamiento;

public class MetodosOrdenamiento {

    public static void main(String[] args) {
//        Burbuja
        int arreglo[] = {7,9,5,2,6};
//        arreglo = burbuja(arreglo);
//
//        for (int elemento : arreglo) {
//            System.out.println(elemento);
//        }
//        QuickSort
        quickSort(arreglo, 0, arreglo.length - 1);
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static int partition(int arr[], int begin, int end) {

        int pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;

            }

        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;

    }

    public static int[] burbuja(int[] array) {
        int aux;
// Por cada elemento del arreglo, se entra a otro for que compara cada 
// posicion del arreglo con su siguiente posicion, excepto el ultimo valor
// por lo que en lla primera interacion de I el elemento mas grande del arreglo
// deberia estar en laultima posicion.
        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }

            }

        }

        int[] arrayOrdenado = array;
        return arrayOrdenado;
    }

}
