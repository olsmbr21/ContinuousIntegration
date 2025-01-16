package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator program!");

        // Menu for operations
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Take inputs for the operation
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform the chosen operation
            try {

            switch (choice) {
                    case 1:
                        System.out.println("Result: " + calculator.add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + calculator.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + calculator.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + calculator.divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
