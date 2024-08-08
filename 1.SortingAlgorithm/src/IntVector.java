import java.util.Random;

public class IntVector {
    private int[] array;
    private int size;
    private static int iterations = 0;

    public IntVector(int size) {
        array = new int[size];
        Random r = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = r.nextInt(1000);
        }
        this.size = size;
    }

    // Sorts this class' array, and returns the iterations
    public int quickSort() {
        quickSort(0, size - 1);
        final int iterations = IntVector.iterations;
        IntVector.iterations = 0;
        return iterations;
    }

    public int get(int index) {
        if(index >= 0)
            return array[index];
        else
            return 0;
    }

    public void print() {
        System.out.print("[");
        for(int i = 0; i < size; i++) {
            if(i == size - 1)
                System.out.println(array[i] + "]");
            else
                System.out.print(array[i] + ", ");
        }
    }

    private void quickSort(int left, int right) {
        int index;
        if(right > left) {
            index = partition(left, right);
            if(index < 0) return;
            quickSort(left, index - 1);
            quickSort(index + 1, right);
        }
        iterations++;
    }

    private int partition(int left, int right) {
        int n = size;
        if(n == 1) return 0;
        
        int
        x = array[right],
        aux;

        int
        i = left,
        j = right - 1;

        do {
            while(array[i] < x && i < size - 1) {
                i++;
                // System.out.println("i: " + i);
            }
            while(array[j] >= x && j > 0) {
                j--;
                // System.out.println("j: " + j);
            }

            if(i < j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        while(i < j);

        aux = array[i];
        array[i] = array[right];
        array[right] = aux;

        return i;
    }
}
