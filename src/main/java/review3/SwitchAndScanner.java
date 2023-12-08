package review3;

import java.util.Scanner;

public class SwitchAndScanner {
    public static void main(String[] args) {
        /*
        Ask user wher he is from and b ased on the countruy specify favorite food

         */
        Scanner capture =new Scanner(System.in);
        System.out.println("Please enter where are you from");
        String country=capture.nextLine();

        switch(country.toLowerCase()){
            case "india":
                System.out.println("You love biriyani");
                break;
            case "egypt":
                System.out.println("You love Koshary");
                break;
            case "georgia":
                System.out.println("Hachapuri");
                break;
            case "moldova":
                System.out.println("Mamoliga");
                break;
            case "kazakhstan":
                System.out.println("You love beshparmak");
                break;
            case "usa":
                System.out.println("You love You love burgers and french fries");
                break;
            case "great britain":
                System.out.println("you love fish and chips");
                break;
            default:
                System.out.println("I dont know your favorite food");
        }
    }
}
