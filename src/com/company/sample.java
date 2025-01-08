package com.company;
/*
public class sample {
    public static void main(String[] args) {
        String input = "TATA STRIVE";
        StringBuilder output = new StringBuilder();

        String processedInput = input.replace(" ", ""); // Remove spaces
        for (int i = 1; i <= processedInput.length(); i++) {
            output.append(processedInput.substring(0, i)).append(" ").;
        }

        System.out.println(output.toString().trim());
    }
}
 */
/*
public class sample {
    public static void main(String[] args) {
        String input = "TATA STRIVE";
        String processedInput = input.replace(" ", ""); // Remove spaces
        StringBuilder result = new StringBuilder();
        StringBuilder current = new StringBuilder();

        for (char ch : processedInput.toCharArray()) {
            current.append(ch);
            if (current.length() % 3 == 0) { // Add the current group after every 3 characters
                result.append(current);
                current.setLength(0); // Reset current StringBuilder
            }
        }

        // Handle remaining characters
        result.append(current);
        System.out.println(result+ " ");
    }
}

 */


/*
public class sample {
    public static void main(String[] args) {
        String input = "TATA STRIVE";
        String processedInput = input.replace(" ", ""); // Remove spaces
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= processedInput.length(); i += 1) { // Modify Length skips iteration`()directs
            result.append(processedInput.substring(0, i)).a.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}

 */
/*
public class sample {
    public static void main(String[] args) {
        String input = "TATA STRIVE";
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Append only non-space characters to the StringBuilder
            if (ch != ' ') {
                sb.append(ch);
                result.append(sb).append(" ");
            }
        }

        // Print the result after removing the trailing space
        System.out.println(result.toString().trim());
    }
}

 */
/*
public class sample {
    public static void main(String[] args) {
        String input = "TATA STRIVE";
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        // Process each word in the input string
        for (String word : input.split(" ")) { // Split the input by spaces
            for (int i = 0; i < word.length(); i++) {
                sb.append(word.charAt(i)); // Append characters one by one
                result.append(sb).append(" "); // Append the growing pattern
            }
        }

        // Print the final result after trimming the trailing space
        System.out.println(result.toString().trim());
    }
}

 */
/* working
public class sample {
    public static void main(String[] args) {
        String word1 = "TATA";
        String word2 = "STRIVE";

        // Extract the first letter of the second word
        char firstLetterOfWord2 = word2.charAt(0);

        // Use StringBuilder to build the pattern
        StringBuilder result = new StringBuilder();

        result.append(word1.substring(0,1)+" ");

        for (int i = 1; i <= word1.length()-1; i++) {
            // Append a substring of word1 from the beginning to the i-th character
            result.append(word1.substring(0, i)).append(firstLetterOfWord2).append(" ");
        }
        for (int i = 1; i <= word2.length(); i++) {
            // Append a substring of word1 from the beginning to the i-th character
            result.append(word1).append(word2.substring(0,i)).append(" ");
        }

        // Print the final result after trimming the trailing space
        System.out.println(result.toString().trim());
    }
}

 */
/*
public class sample {
    public static void main(String[] args) {
        String word1 = "TATA STRIVE";


        // Extract the first letter of the second word
        char firstLetterOfWord2 = word1.charAt(5);
        String second = word1.substring(0,5);
        String third = word1.substring(5);
        System.out.println(second);
        System.out.println(third);

        // Use StringBuilder to build the pattern
        StringBuilder result = new StringBuilder();

//        result.append(word1.substring(0,1)+" ");
//
//        for (int i = 1; i <= word1.length()/2-1; i++) {
//            // Append a substring of word1 from the beginning to the i-th character
//            result.append(word1.substring(0, i)).append(firstLetterOfWord2).append(" ");
//        }
        for (int i = 1; i <= third.length(); i++) {
            // Append a substring of word1 from the beginning to the i-th character
            result.append(second);
            result.append(third.substring(0,i)).append(" ");

        }

        // Print the final result after trimming the trailing space
        System.out.println(result.toString().trim());
    }
}

 */

/*
public class sample {
    public static void main(String[] args) {
        String input = "TATA STRIVE";

        // Remove spaces to process the characters as a single sequence
        String word = input.replace(" ", "");

        // Use StringBuilder to build the pattern
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        // Process each character in the word
        for (char ch : word.toCharArray()) {
            sb.append(ch); // Append the current character
            result.append(sb).append(" "); // Append the growing pattern to the result
        }

        // Print the final result after trimming the trailing space
        System.out.println(result.toString().trim());
    }
}

 */



public class sample {
    public static void main(String[] args) {
        String input = "TATA STRIVE";

        String[] words = input.split(" ");
        String word1 = words[0];
        String word2 = words[1];
        String second = input.substring(0,5);
        String first = input.substring(0,1);
        System.out.println(first);

        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        for (int i = 1; i <= word1.length(); i++) {
            result.append(word1.substring(0, i)).append(" ");
            result.append(word2.charAt(0));
            result.append(" \n");
        }
        for (int i = 1; i <= word2.length(); i++) {
            result2.append(second).append(word2.substring(0,i));
            result2.append(" \n");
        }
        System.out.println(result.toString().trim());
        System.out.println(result2.toString().trim());
    }
}








