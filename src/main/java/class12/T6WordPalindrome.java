package class12;

public class T6WordPalindrome {
    public static void main(String[] args) {
        String str = "Mom";
        String reversedWord="";
        for(int i =str.length()-1;i>=0;i--){
            reversedWord = reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}
