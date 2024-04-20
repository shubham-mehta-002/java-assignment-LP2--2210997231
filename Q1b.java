import java.util.Scanner;
public class Q1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " "); 
                num= num* (i - j) / (j + 1);
            }
            System.out.println(); 
        }
    }
}