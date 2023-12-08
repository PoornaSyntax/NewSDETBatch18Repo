package practice;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {88,90,78,45},
                {45,55,66}
        };

        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[0][2]);//50
        System.out.println(matrix[3][2]);//66

        System.out.println(matrix.length);//no. of rows
        System.out.println(matrix[0].length);//3
        System.out.println(matrix[2].length);//4
        //every row can have different length, so we cannot get column length





    }
}
