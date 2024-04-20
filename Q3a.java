import java.util.Scanner;

public class Q3a {

    public static void GradeIfElse(int score) {
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score < 60 && score >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid score.");
            return;
        }

        System.out.println("Grade: " + grade);
    }

    public static void GradeSwitch(int score) {
        char grade;

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                if (score >= 0 && score <= 100) {
                    grade = 'F';
                } else {
                    System.out.println("Invalid score.");
                    return;
                }
        }

        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = sc.nextInt();
        System.out.println("\nUsing if-else :");
        GradeIfElse(score);

        System.out.println("\nUsing switch-case:");
        GradeSwitch(score);
    }
}