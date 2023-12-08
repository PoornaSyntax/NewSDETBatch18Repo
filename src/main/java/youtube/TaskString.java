package youtube;

public class TaskString {
    /*Create a String and if the String is not empty
      perform the following:
      If the string has an odd number of characters and has 3 or more characters,
      print the character in the middle of the String.
      For Example String str=hello=>l

     */
    public static void main(String[] args) {
        String str ="hello";
        if (!str.isEmpty()) {
            int length = str.length();

            if (length % 2 != 0 && length >= 3) {
                int middleIndex = length / 2;
                System.out.println("Middle Index: " +middleIndex);
                char middleCharacter = str.charAt(middleIndex);
                System.out.println("Middle character: " + middleCharacter);
            } else {
                System.out.println("String does not have an odd number of characters or has less than 3 characters.");
            }
        } else {
            System.out.println("String is empty.");
        }
        }
    }

