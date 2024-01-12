package practice;

public class Array {
    public static void main(String[] args) {
        int[][] numbers={{12,13,14,15,16},
                         {21,22,23,24,25},
                         {31,32,33,34,35}
                };

        for(int row=0;row<numbers.length;row++) {
            for (int col = 0; col<numbers[row].length;col++)
            {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }


    }
}
