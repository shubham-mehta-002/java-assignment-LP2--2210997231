import java.util.Scanner;

public class Q4f {

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int magicNumber = 0;
        for (int j = 0; j < n; j++) {
            magicNumber += matrix[0][j];
        }
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicNumber) {
                return false;
            }
        }
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicNumber) {
                return false;
            }
        }
        int diagonalSum1 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum1 += matrix[i][i];
        }
        if (diagonalSum1 != magicNumber) {
            return false;
        }
        int diagonalSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum2 += matrix[i][n - 1 - i];
        }
        if (diagonalSum2 != magicNumber) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the square matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean isMagic = isMagicSquare(matrix);
        if (isMagic) {
            System.out.println("The given square matrix is a magic square.");
        } else {
            System.out.println("The given square matrix is not a magic square.");
        }
    }
}