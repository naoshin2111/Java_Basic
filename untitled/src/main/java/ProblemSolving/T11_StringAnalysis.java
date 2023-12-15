package ProblemSolving;

public class T11_StringAnalysis {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        String[] words = input.trim().split("\\s+");

        wordCount = words.length;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                charCount++;

                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }
}

