package ProblemSolving;

import java.util.Scanner;

public class T4_SearchCGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        for (int i = 0; i < cgpas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < cgpas.length; j++) {
                if (cgpas[j] < cgpas[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = cgpas[minIndex];
            cgpas[minIndex] = cgpas[i];
            cgpas[i] = temp;
        }

        System.out.print("Enter your CGPA to search: ");
        double targetCGPA = scanner.nextDouble();

        int result = binarySearch(cgpas, targetCGPA);
        if (result == -1) {
            System.out.println("CGPA not found.");
        } else {
            System.out.println("CGPA found at index: " + result);
        }

        scanner.close();
    }

    private static int binarySearch(double[] array, double target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
