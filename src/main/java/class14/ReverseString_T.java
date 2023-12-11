package class14;

public class ReverseString_T {

    public static String word(String str){
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        return str;
    }

    public static void main(String[] args) {
        ReverseString_T rWord = new ReverseString_T();
        rWord.word("Syntax Technologies") ;
    }
}
