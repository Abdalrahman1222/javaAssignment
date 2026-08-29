package javaAssignment;

import java.util.Scanner;

public class NumberAnalyzer {

    /**
     * This method prints numbers starting from 10 down to 1.
     */
    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * This method goes through numbers 1 to 10 and prints
     * whether each one is even or odd.
     */
    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    /**
     * This method checks if a number is positive, negative, or zero.
     *
     * @param number the number we want to check
     * @return the result as a String: "Positive", "Negative", or "Zero"
     */
    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * This method adds two numbers together.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of the two numbers
     */
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * This is where the program starts. It shows the menu
     * and lets the user choose what to do.
     *
     * @param args not used in this program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();

                    String result = checkNumberType(number);
                    System.out.println(result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int number1 = scanner.nextInt();

                    System.out.print("Enter second number: ");
                    int number2 = scanner.nextInt();

                    int sum = calculateSum(number1, number2);
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        scanner.close();
    }
}