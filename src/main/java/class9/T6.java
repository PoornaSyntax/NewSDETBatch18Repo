package class9;

public class T6 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integer type where you
        will store odd and even numbers in 3 rows
        aand 4 columns. Develop a program which will
        identify/print the even numbers only

         */
        int[][] numbers={
                {10,20,50,60},
                {25,35,66,67},
                {80,90,78,45},


    };
        int even=0,odd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");
                }
            }

}}}
