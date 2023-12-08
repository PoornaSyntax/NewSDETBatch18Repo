package class4;

import java.util.Scanner;

public class T3Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Loan");
        double loanAmount = sc.nextDouble();
        if(loanAmount<=200000){
            System.out.println("You can get this loan");
        }else {
            System.out.println("This amount cannot be provided");
        }
    }
}
