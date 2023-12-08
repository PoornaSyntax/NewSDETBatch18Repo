package class7;
/*create an arry of chars and store grades into
it:A,B,C,D.then print grade B(use 2 different
ways of creating array)
 */
public class T1Arrays {
    public static void main(String[] args) {
        char[] grades= new char[4];
        grades[0]='A';
        grades[1]='B';
        grades[2]='C';
        grades[3]='D';
        System.out.println(grades[1]);

        char [] grade = {'A','B','C','D'};
        //char [] grade =new char[4];
        System.out.println(grade[1]);

    }
}
