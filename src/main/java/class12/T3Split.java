package class12;
/*
You have a string
How would you find out how many sentences are in that String?
 */

public class T3Split {
    public static void main(String[] args) {
        String a = "Is it Saturday? Is it raining? Do we have a Java Class today?";
        String[] wordArr= a.split("[?]");
        System.out.println(wordArr.length);
    }

}
