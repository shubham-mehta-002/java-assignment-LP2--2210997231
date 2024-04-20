public class Q4a{
    public static void rotateRight(int[] array, int positions) {
        for (int i = 0; i < positions; i++) {
            int last = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = last;
        }
    }
    public static void rotateLeft(int[] array, int positions) {
        for (int i = 0; i < positions; i++) {
            int first = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = first;
        }
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = { 10,20,30,45,55 };
        int positions = 2;
        System.out.println("Original Array:");
        printArray(array);
        rotateRight(array, positions);
        System.out.println("Array after rotating " + positions + " positions to the right:");
        printArray(array);
        rotateLeft(array, positions);
        System.out.println("Array after rotating " + positions + " positions to the left:");
        printArray(array);
    }
}