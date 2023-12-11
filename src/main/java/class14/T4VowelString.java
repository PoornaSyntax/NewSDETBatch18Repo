package class14;

public class T4VowelString {
    /*
    Create a method that will accept a String as a parameter and return a new String that
    consist only of vowels. Method should be available inside the class only where it was
    declared and executed by calling it is name.
     */
        public static void main(String[] args) {
            // Example usage
            String inputString = "Hello World!";


            System.out.println("Original String: " + inputString);
            System.out.println("Vowels Only: " + extractVowels("Hello World"));
        }

        private  static String extractVowels(String input) {
            // Remove non-vowel characters from the string
            return input.replaceAll("[^aeiouAEIOU]", "");
        }
    }


