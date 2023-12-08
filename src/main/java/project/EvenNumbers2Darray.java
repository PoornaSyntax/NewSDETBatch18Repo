package project;

import java.util.Arrays;

public class EvenNumbers2Darray {

        public static void main(String[] args) {
            int[][] numbers = {
                    {3, 11, 4, 8, 20},
                    {40, 14, 58, 77, 54},
                    {19, 10, 25, 50, 38}
            };

            System.out.println("Even numbers from each row:");
            for (int[] num : numbers) {
                System.out.print("Row " + Arrays.toString(num) + " even numbers: ");
                for (int evenNumbers : num) {
                    if (evenNumbers % 2 == 0) {
                        System.out.print(evenNumbers + " ");
                    }
                }
                System.out.println(); // Move to the next line after printing even numbers of a row
            }
        }
    }


