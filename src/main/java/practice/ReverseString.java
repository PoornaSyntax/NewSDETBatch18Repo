package practice;

public class ReverseString {


           public static void main(String[] args) {
            String input = "Hello";
            String reversed = reverseString(input);
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);
        }

        public static String reverseString(String input) {
            int length = input.length();

            // Use a for loop to reverse the string in-place
            for (int start = 0, end = length - 1; start < end; start++, end--) {
                // Swap characters at positions start and end
                char startChar = input.charAt(start);
                char endChar = input.charAt(end);

                // Create a new string with swapped characters
                input = input.substring(0, start) + endChar + input.substring(start + 1, end) + startChar + input.substring(end + 1);


            }

            return input;
        }
    }




