package MockInterview;

public class Mock2AlphaCharacters {

       public static void main(String[] args) {
            String inputString = "Hello123World";

            int alphabetCount = countAlphabets(inputString);

            System.out.println("Input String: " + inputString);
            System.out.println("Number of Alphabets: " + alphabetCount);
        }

        private static int countAlphabets(String str) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                    count++;
                }

            }
            return count;
        }

    }

