package project;

public class Q2SumOfArray {
    public static void main(String[] args) {
        /*
        Create an array of integer values. After the array is created, calculate the
        sum of all stored elements in that array
         */
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int n:numbers){
            sum+=n;
        }
        System.out.println("The sum of all the elements in the array is : "+sum);
    }
}
