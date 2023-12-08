package class9;

public class T2 {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
         for(int row =0;row<matrix.length;row++){
            int sum = 0;
            for(int col=0;col<matrix[row].length;col++){
                sum = sum + matrix[row][col];
             }
            System.out.println();
            System.out.println("The sum of the elements in the 2d array is of row number "+(row+1)+" is :"+ sum);

        }

        }
    }

