package ProblemSolving;

import java.util.Random;

public class T6_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Random Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}