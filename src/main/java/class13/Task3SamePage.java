package class13;

public class Task3SamePage {
    public static void main(String[] args) {
        Task3SamePage p =new Task3SamePage();
        p.isPalindrome("Mom");
    }
    void isPalindrome(String word){
        String reverseWord ="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverseWord=reverseWord+word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println(" It's a Palindrome");
        }else{
            System.out.println("It's not Palindrome");
        }
    }
}

