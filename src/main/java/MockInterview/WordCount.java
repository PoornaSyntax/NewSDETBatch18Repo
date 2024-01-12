package MockInterview;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        int wordCount = countWords(inputString);
        System.out.println("Number of words in the given string: " + wordCount);
    }

    static int countWords(String str) {
        // to remove whitespaces
        str = str.trim();

        // Handling cases where the string is empty
        if (str.isEmpty()) {
            return 0;
        }

        // Splitting the string into words using spaces and punctuation
        String[] words = str.split("\\s+");

        // Counting the number of words
        return words.length;
    }
    }

