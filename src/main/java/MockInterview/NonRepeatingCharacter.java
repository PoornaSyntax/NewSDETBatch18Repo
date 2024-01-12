package MockInterview;

public class NonRepeatingCharacter {
    public static void main(String[] args) {


    String word = "abracadabra";
    boolean foundNonRepeating = false;

for (int i = 0; i < word.length(); i++) {
        char currentChar = word.charAt(i);
        boolean isRepeated = false;

        for (int j = i + 1; j < word.length(); j++) {
            if (currentChar == word.charAt(j)) {
                isRepeated = true;
                break;  // Exit the inner loop
            }
        }

        if (!isRepeated) {
            System.out.println("The first non-repeating character is: " + currentChar);
            foundNonRepeating = true;
            break;  // Exit the outer loop if you want to stop at the first non-repeating character
        }
    }

if (!foundNonRepeating) {
        System.out.println("There is no non-repeating character in the String");
    }

}}
