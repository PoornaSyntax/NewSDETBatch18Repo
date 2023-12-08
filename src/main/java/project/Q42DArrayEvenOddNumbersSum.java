package project;

public class Q42DArrayEvenOddNumbersSum {
    /*
    Create a 2D array or integer type where you will store odd and even
    numbers. Develop a program which will identify/print the even numbers
    only
     */
    public static void main(String[] args) {
        int[][] numbers={
                {10,20,50,60},
                {25,35,66,67},
                {80,90,78,45},


        };
        System.out.println("numbers.length "+numbers.length);
        int even=0,odd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                   even+=numbers[i][j];
                }else{
                    odd+=numbers[i][j];
                }
            }

    }
        System.out.print("Sum of the even numbers in the array is : "+even+ " and sum of odd numbers is  "+odd);
}}
