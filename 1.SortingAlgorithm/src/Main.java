public class Main {
    public static void main(String[] args) {
        System.out.println();
        IntVector v = new IntVector(100);
        int iterations = v.quickSort();
        v.print();

        System.out.println("Iterations: " + iterations);
    }
}
