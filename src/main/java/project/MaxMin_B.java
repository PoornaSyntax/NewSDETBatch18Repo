package project;

public class MaxMin_B {
    public static void main(String[] args) {
        int[] num = {23,44,12,21,45,76,87,43,52,101};
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]<min){
                min = num[i];
            }else if(num[i]>max){
                max = num[i];
            }
        }
        //Print the Max and Min
        System.out.println("The minimum number in array is " +min);
        System.out.println("The maximum number in the array is " +max);
    }
}
