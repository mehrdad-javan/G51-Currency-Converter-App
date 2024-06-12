package se.lexicon;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu();
        int choice = scanner.nextInt();
        performOperations(choice); //1

    }


    public static void displayMenu() {
        System.out.println("Currency Converter App");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }


    public static void performOperations(int operationNumber) { // 1

        switch (operationNumber) {
            case 1:
                System.out.println("Operation 1 has been executed!");
                break;
            case 2:
                System.out.println("Operation 2 has been executed!");
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


}
