package project;

public class Q5SwapNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("The Numbers before swapping num1 ="+num1+" and num2 = "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println();
        System.out.println("The numbers after swapping num1 = "+num1+" and num2 = "+num2);
    }
}
