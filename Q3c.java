import java.util.Scanner;

public class Q3c {
    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double convertedAmount;

        switch (sourceCurrency.toUpperCase()) {
            case "USD":
                convertedAmount = convertFromUSD(amount, targetCurrency);
                break;
            case "EUR":
                convertedAmount = convertFromEUR(amount, targetCurrency);
                break;
            case "GBP":
                convertedAmount = convertFromGBP(amount, targetCurrency);
                break;
            case "INR":
                convertedAmount = convertFromINR(amount, targetCurrency);
                break;
            default:
                System.out.println("Invalid source currency.");
                return -1;
        }

        return convertedAmount;
    }

    public static double convertFromUSD(double amount, String targetCurrency) {
        double conversionRate;
        switch (targetCurrency.toUpperCase()) {
            case "USD":
                return amount;
            case "EUR":
                conversionRate = 0.85;
                break;
            case "GBP":
                conversionRate = 0.72;
                break;
            case "INR":
                conversionRate = 74.93;
                break;
            default:
                System.out.println("Invalid target currency.");
                return -1;
        }
        return amount * conversionRate;
    }

    public static double convertFromEUR(double amount, String targetCurrency) {
        double conversionRate;
        switch (targetCurrency.toUpperCase()) {
            case "USD":
                conversionRate = 1.18;
                break;
            case "EUR":
                return amount;
            case "GBP":
                conversionRate = 0.85;
                break;
            case "INR":
                conversionRate = 88.57;
                break;
            default:
                System.out.println("Invalid target currency.");
                return -1;
        }
        return amount * conversionRate;
    }

    public static double convertFromGBP(double amount, String targetCurrency) {
        double conversionRate;
        switch (targetCurrency.toUpperCase()) {
            case "USD":
                conversionRate = 1.39;
                break;
            case "EUR":
                conversionRate = 1.18;
                break;
            case "GBP":
                return amount;
            case "INR":
                conversionRate = 104.65;
                break;
            default:
                System.out.println("Invalid target currency.");
                return -1;
        }
        return amount * conversionRate;
    }

    public static double convertFromINR(double amount, String targetCurrency) {
        double conversionRate;
        switch (targetCurrency.toUpperCase()) {
            case "USD":
                conversionRate = 0.013;
                break;
            case "EUR":
                conversionRate = 0.011;
                break;
            case "GBP":
                conversionRate = 0.010;
                break;
            case "INR":
                return amount;
            default:
                System.out.println("Invalid target currency.");
                return -1;
        }
        return amount * conversionRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter the source currency (USD, EUR, GBP, INR): ");
        String sourceCurrency = sc.nextLine();

        System.out.print("Enter the target currency (USD, EUR, GBP, INR): ");
        String targetCurrency = sc.nextLine();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);
        if (convertedAmount != -1) {
            System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        }
    }
}
