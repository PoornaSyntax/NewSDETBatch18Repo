package practice;

public class Array2 {
    public static void main(String[] args) {
        int[][] numbers={
                         {11,12,13,14},
                         {15,16,17,18},
                         {19,20,21,22}
        };

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
