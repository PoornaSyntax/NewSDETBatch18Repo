package class12;
/*
Create a string that should be combination
of letters, numbers and special characters. Find out how many Alphabets(abd AZ)
characters are there in the String

 */
public class T1StringAlphabets {
    public static void main(String[] args) {
        String str ="bkfdSAHBDSH2232398487#Y*&#$%";
        //System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
