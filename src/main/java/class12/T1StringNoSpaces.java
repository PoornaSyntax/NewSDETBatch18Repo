package class12;
/*
Create a String that will hold a sentence.
Write a program to get a new String without spaces.
 */
public class T1StringNoSpaces {
    public static void main(String[] args) {


//        String str = "I love Java class";
//        System.out.println(str.replaceAll(" ", ""));
//        System.out.println(str);

        String str = "Java is very easy";
        String newStr = str.replaceAll(" ","");
        System.out.println(newStr);

    }
}