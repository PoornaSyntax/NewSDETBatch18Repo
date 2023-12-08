package class9;

public class E2Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };

        System.out.println(matrix[1][1]);
        System.out.println(matrix[0][2]);
        System.out.println(matrix[3][2]);
        //System.out.println(matrix[0][3]);
        //gives number of rows
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);//3
        System.out.println(matrix[2].length);//4


    }


}
