package ProblemSolving;

import java.util.HashSet;
import java.util.Set;

public class T12_DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Output:");
        for (int number : duplicates) {
            System.out.print(number + " ");
        }
    }
}

