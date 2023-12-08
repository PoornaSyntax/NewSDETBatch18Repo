package class4;
/*
Write a program to ask the user to enter the number of worked years and annual salary.
 If the user worked for more or equals to 5 years then user is eligible for bonus, otherwise he is not.
 Once user is eligible and salary is larger than 50000 than bonus =5000, otherwise bonus=3000.

 */

import java.util.Scanner;

public class T7Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of years you have worked");
        double noOfYears = sc.nextDouble();
        System.out.println("Enter your annual salary");
        double annualSalary = sc.nextDouble();
        if(noOfYears>=5){
            System.out.println("You are eligible for bonus");
            if(annualSalary>50000){
                System.out.println("You will have bonus 5000");
            }else {
                System.out.println("You will have bonus 3000");
            }
        }else{
            System.out.println("You are not eligible for bonus");
        }


    }
}
