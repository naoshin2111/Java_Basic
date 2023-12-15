package ProblemSolving;

import java.util.Scanner;

public class T10_LowestHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[10];

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter height for baby " + (i + 1) + " in cm:");
            heights[i] = scanner.nextDouble();
        }

        double lowest = Double.MAX_VALUE;
        double secondLowest = Double.MAX_VALUE;

        for (double height : heights) {
            if (height < lowest) {
                secondLowest = lowest;
                lowest = height;
            } else if (height < secondLowest && height != lowest) {
                secondLowest = height;
            }
        }

        System.out.println("The lowest height is: " + lowest + " cm");
        System.out.println("The second lowest height is: " + secondLowest + " cm");

        scanner.close();
    }
}
