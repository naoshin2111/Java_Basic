package ProblemSolving;

import java.util.Scanner;

public class T14_SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum them up. Enter 'q' to quit.");

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                System.out.println("Current Sum: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        System.out.println("Final Sum: " + sum);
        scanner.close();
    }
}
