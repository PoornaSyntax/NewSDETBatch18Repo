package practice;

public class E3Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {88,90,78,45},
                {45,55,66}
        };

        int[] row = matrix[2];
        System.out.println(row[2]);

        for(int i=0;i<row.length;i++){
            System.out.print(row[i]+" ");
        }

    }
}
