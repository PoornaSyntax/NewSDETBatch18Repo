package class5;
/*
Using scanner class create calulator.Allow user to enter 2
numbers and operator(+,-,*,/). Based on operator provide result to
user.
Please complete this assignment in 2 says: Using if statement and
switch case.
 */

import java.util.Scanner;

public class HWCalculatorSwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a first  Number");
        double num1 = sc.nextDouble();
        System.out.println("Please enter second number");
        double num2 = sc.nextDouble();
        System.out.println("Please Enter the operator'+','-','*','/'");
        char operator = sc.next().charAt(0);
        double result=0.0;
        switch(operator){
            case '+':
                result= num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if(num2!=0) {
                    result = num1 / num2;
                }else {
                    System.out.println("Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator ,Arithmetic operation not applicable");
        }
        System.out.println("The Result is " +result);
    }
}
