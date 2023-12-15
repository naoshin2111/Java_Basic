package ProblemSolving;

import java.util.Arrays;

public class T5_MedianCGPA {
    public static void main(String[] args) {

        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpas);

        double median;
        int totalElements = cgpas.length;

        if (totalElements % 2 == 0) {
            double sumOfMiddleElements = cgpas[totalElements / 2] + cgpas[totalElements / 2 - 1];
            median = sumOfMiddleElements / 2;
        } else {
            median = cgpas[totalElements / 2];
        }

        System.out.println("The median CGPA is: " + median);
    }
}