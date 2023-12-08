package class13;

import java.util.Scanner;

public class PrimeTester {
    /*
    Write a method to return whether given number is prime or not?
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int num = scanner.nextInt();
        PrimeNumber obj=new PrimeNumber();
        boolean prime = obj.isPrime(num);
        if (prime){
            System.out.println(num+ " is a prime number");

        }
        else{
            System.out.println(num + "is not a prime number");
        }

    }
}
