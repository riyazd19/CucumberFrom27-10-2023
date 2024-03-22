package stringManuProg;
public class SwapColors {
    public static void main(String[] args) {
        String originalString = "hi blue i am red";
        
        // Split the string into words
        String[] words = originalString.split(" ");
        //int j=1;
        
       // System.out.println(words[j]);
        
        // Iterate through the words to find "blue" and "red"
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("blue")) {
                words[i] = "red";
            } else if (words[i].equals("red")) {
                words[i] = "blue";
            }
        }
        
        // Reconstruct the string
        StringBuilder swappedString = new StringBuilder();
        for (String word : words) {
            swappedString.append(word).append(" ");
        }
        
        // Print the swapped string
        System.out.println(swappedString.toString().trim());
    }
}
