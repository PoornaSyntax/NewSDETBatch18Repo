package homework;

public class Repl {


           public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter a word: ");
//            String word = scanner.nextLine();
               String word="hello";

            // Loop through each character of the word and print on a separate line
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                System.out.println(character);
            }


        }
    }


