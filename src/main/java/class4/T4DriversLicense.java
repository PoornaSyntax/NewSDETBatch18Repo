package class4;
/*
You are DMV representative and
you need to ask the customer their age
if they are 18 or older you will

 */

import java.util.Scanner;

public class T4DriversLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("I will issue a driving license to you");
        } else {
            System.out.println("for now you can only have learner's permit ");
        }
    }
    }

