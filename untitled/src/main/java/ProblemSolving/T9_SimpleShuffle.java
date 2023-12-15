package ProblemSolving;

import java.util.Random;

public class T9_SimpleShuffle {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = random.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

