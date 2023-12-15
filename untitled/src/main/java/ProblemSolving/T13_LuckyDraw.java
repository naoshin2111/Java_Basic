package ProblemSolving;

import java.util.Random;
import java.util.Scanner;

public class T13_LuckyDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] luckyNumbers = {100, 150, 140, 180, 170, 200, 250, 230, 220, 300};
        Random random = new Random();

        System.out.println("Enter your lucky number from the list: [100, 150, 140, 180, 170, 200, 250, 230, 220, 300]");
        int userNumber = scanner.nextInt();

        boolean isLucky = false;
        for (int i = 0; i < 3; i++) {
            int generatedIndex = random.nextInt(luckyNumbers.length);
            int generatedNumber = luckyNumbers[generatedIndex];

            if (userNumber == generatedNumber) {
                System.out.println("You are lucky!");
                isLucky = true;
                break;
            } else {
                System.out.println("Not lucky this time. Generated number was: " + generatedNumber);
            }
        }

        if (!isLucky) {
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}
