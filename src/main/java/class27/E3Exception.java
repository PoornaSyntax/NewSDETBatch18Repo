package class27;

import java.util.Scanner;

public class E3Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the numbers that you want to divide");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num2==0){
            System.out.println("We can't divide by zero");
        }else {System.out.println();}
        System.out.println(10/2);

    }
}
