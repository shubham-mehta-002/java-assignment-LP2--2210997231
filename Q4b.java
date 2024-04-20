import java.util.Scanner;

public class Q4b {

    public static int[] removeDuplicates(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1) {
            return arr; 
        }
        int uniqueCount = 1;
        for (int i = 1; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[uniqueCount++] = arr[i];
            }
        }

        int[] uniqueArray = new int[uniqueCount];
        System.arraycopy(arr, 0, uniqueArray, 0, uniqueCount);
        return uniqueArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array with duplicates removed:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}