import java.util.Random;

public class Q2b  {

    public static String Password(int length, boolean includeUppercase, boolean includeLowercase,
                                           boolean includeNumbers, boolean includeSpecialChars) {
        StringBuilder password = new StringBuilder();
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()_-+=";

        StringBuilder charSet = new StringBuilder();
        if (includeUppercase) charSet.append(uppercaseChars);
        if (includeLowercase) charSet.append(lowercaseChars);
        if (includeNumbers) charSet.append(numberChars);
        if (includeSpecialChars) charSet.append(specialChars);

        if (charSet.length() == 0) {
            System.out.println("Error: No character set selected.");
            System.exit(1);
        }

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charSet.length());
            password.append(charSet.charAt(randomIndex));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid number of arguments.");
        }

        int length = Integer.parseInt(args[0]);
        boolean includeUppercase = false;
        boolean includeLowercase = false;
        boolean includeNumbers = false;
        boolean includeSpecialChars = false;

        for (int i = 1; i < args.length; i++) {
            String arg = args[i];
            switch (arg) {
                case "upper":
                    includeUppercase = true;
                    break;
                case "lower":
                    includeLowercase = true;
                    break;
                case "numbers":
                    includeNumbers = true;
                    break;
                case "special":
                    includeSpecialChars = true;
                    break;
                default:
                    System.out.println("Invalid character set: " + arg);
            }
        }

        String password = Password(length, includeUppercase, includeLowercase, includeNumbers, includeSpecialChars);
        System.out.println("Generated password: " + password);
    }
}