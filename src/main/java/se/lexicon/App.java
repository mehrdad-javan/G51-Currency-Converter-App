package se.lexicon;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            performOperations(choice);
        } while (choice != 0);
    } // end of the main method


    private static void displayMenu() {
        System.out.println("Currency Converter App");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }


    private static void performOperations(int operationNumber) {
        Scanner scanner = new Scanner(System.in);
        double usdAmount, sekAmount;

        switch (operationNumber) {
            case 1:
                sekAmount = getAmount("SEK");
                usdAmount = ExchangeOperations.convertSekToUsd(sekAmount);
                displayConversionResult(sekAmount, usdAmount, "SEK", "USD");
                break;
            case 2:
                usdAmount = getAmount("USD");
                sekAmount = ExchangeOperations.convertUsdToSek(usdAmount);
                displayConversionResult(usdAmount, sekAmount, "USD", "SEK");
                break;
            case 3:
                System.out.println("Operation 3 has been executed!");
                break;
            case 4:
                System.out.println("Operation 4 has been executed!");
                break;
            case 0:
                System.out.println("Exiting the currency converter app. Goodbye.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }

    }


    private static double getAmount(String currency) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in " + currency + " : ");
        return scanner.nextDouble();
    }


    private static void displayConversionResult(double fromAmount, double toAmount, String fromCurrency, String toCurrency) {
        System.out.println(fromAmount + " " + fromCurrency + " is equal to " + toAmount + " " + toCurrency + " .");

    }


}
