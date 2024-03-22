package fakerJavaExamples;
public class WordSwap {
    public static String swapWords(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        
        System.out.println(words);

        // If the input string has less than two words, return it as it is
        if (words.length < 2) {
            return input;
        }

        // Swap the first and last words
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;

        // Reconstruct the string with swapped words
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }

        // Trim any extra whitespace at the end and return the result
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello blue i am red";
        String output = swapWords(input);
        System.out.println(output);  // Output: Hello red i am blue
    }
}
