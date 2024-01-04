package MockInterview;
import java.util.Scanner;
public class Mock4Palindrome {
    // Find out if a world is Palindrome?



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Mock4Palindrome p=new Mock4Palindrome();
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (p.isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }

            scanner.close();
        }

        // Function to check if a string is a palindrome
        public  boolean isPalindrome(String str) {
            str = str.toLowerCase(); // Convert the word to lowercase for case-insensitive comparison
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }

