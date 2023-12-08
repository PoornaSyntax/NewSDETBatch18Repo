package homework;
/*
From an array of integer elements find the largest number.
 */

public class ArrayLargestNumber {
    public static void main(String[] args) {
        int[] numbers ={5,4,12,10,15};
        int largestNum=numbers[0];

        for(int i = 0;i<numbers.length;i++) {
            if (largestNum < numbers[i]) {
                largestNum = numbers[i];
            }
        }
        System.out.println("The largest number of the array is "+largestNum);

    }
}
