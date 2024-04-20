import java.util.Scanner;

public class Q4e {

    public static int countIslands(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    markIsland(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void markIsland(int[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = -1;
        markIsland(grid, i + 1, j);
        markIsland(grid, i - 1, j);
        markIsland(grid, i, j + 1);
        markIsland(grid, i, j - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];
        System.out.println("Enter the elements of the grid (1 for land, 0 for water):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int islandCount = countIslands(grid);
        System.out.println("Number of islands: " + islandCount);
    }
}