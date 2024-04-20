import java.util.Scanner;

public class Q1c {
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = sc.nextInt();

        int recursiveResult = factorialRecursive(n);
        System.out.println("Factorial of " + n + " using recursion is: " + recursiveResult);


        int loopResult = factorialLoop(n);
        System.out.println("\nFactorial of " + n + " using a loop is: " + loopResult+"\n");
    }
}