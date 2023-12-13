package ProblemSolving;

public class T2_SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;

        for (int i = 0; i < cgpas.length; i++) {
            if (cgpas[i] > highest) {
                secondHighest = highest;
                highest = cgpas[i];
            } else if (cgpas[i] > secondHighest && cgpas[i] != highest) {
                secondHighest = cgpas[i];
            }
        }

        System.out.println("Second highest CGPA: " + secondHighest);
    }
}
