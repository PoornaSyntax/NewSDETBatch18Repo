package project;

public class EvenNumbersBikal {
    public static void main(String[] args) {
        int[][] numbers = {
                {3, 11, 4, 8, 20},
                {40, 14, 58, 77, 54},
                {19, 10, 25, 50, 38}
        };
        System.out.println("Even numbers from 2D array :");

        for (int[] num : numbers) {
            //System.out.println(Arrays.toString(num));
            //System.out.println();
            for (int evenNumbers : num) {
                if ( evenNumbers %2 ==0) {
                    System.out.print(evenNumbers + " ");
                }
            }
        }
    }
}
