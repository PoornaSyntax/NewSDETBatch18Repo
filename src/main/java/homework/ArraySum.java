package homework;
/*
Create an array on integers and calculate the sum of all elements in an array
 */

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //Calculating the sum of all elements in the array
        int sum = 0;
        for (int i=0;i<=numbers.length-1;i++){
            sum = sum + numbers[i];
        }
        System.out.println("Printing the sum of the numbers in the array");
        for(int i = 0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println("Sum = "+sum);

    }
}
