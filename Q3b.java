import java.util.Scanner;

public class Q3b {

    public static void Triangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid side lengths. Triangle sides must be positive integers.");
            return;
        }

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the triangle:");
        System.out.print("Side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Side 3: ");
        int side3 = sc.nextInt();
        Triangle(side1, side2, side3);
    }
}
