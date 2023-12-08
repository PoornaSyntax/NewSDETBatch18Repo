package homework;

import java.util.Scanner;

public class T2Class5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        if(num>=1 &&num<=10){
            System.out.println(num+ " is small number");
        }else if(num>=11&&num<= 100){
            System.out.println(num+" is medium number");
        }else if(num>=101 && num<=1000){
            System.out.println(num+ " is Large number");
        }

    }
}
