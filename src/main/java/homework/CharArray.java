package homework;

public class CharArray {
    /*
    Create an array of chars and store grades into it:A,B,C,D. Then
    print agrade B (use 2 different ways of crating an array.)
     */
    public static void main(String[] args) {

          char[] grades = new char[4];
          grades[0]='A';
          grades[1]='B';
          grades[2]='C';
          grades[3]='D';
        System.out.println(grades[1]);

        char[] grade ={'A','B','C','D'};
        System.out.println(grade[1]);

    }
}
