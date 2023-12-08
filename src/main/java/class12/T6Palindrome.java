package class12;
/*
How would you check if String is palindrome or not? aba =>true
Abbc=>false
 */

import java.util.Scanner;

public class T6Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check it is Palindrome or not");
        String str = sc.next();
        String Pal="";
        for(int i=str.length()-1;i>=0;i--){
            Pal = Pal + str.charAt(i);
        }
        if(Pal.equals(str)){
            System.out.println(Pal+ " is a Palindrome ");
        }else{
            System.out.println(Pal + "  is not a palindrome");
        }
    }
}
