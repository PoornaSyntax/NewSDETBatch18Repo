package class4;
/*
Create a Java program that will ask if user has a credit card or not. If
your user does not have a credit card then offer them. If they do have
one ask what is balance on the card? If balance of the card is larger than
1000, tell them to pay off immediately. other wise you can tell them
that they can spend more

 */

import java.util.Scanner;

public class T6CreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a credit card Y/N");
        char card= sc.next().charAt(0);

        if (card == 'Y' || card == 'y') {
            System.out.println("What is the balance on the card?");
            double balance = sc.nextDouble();

            if(balance>1000){
                System.out.println("You should pay off the balance immediately");
            }else{
                System.out.println("You can spend more");
            }
            }else{
            System.out.println("Would you like  a credit card");
            String applyForCard = sc.next();
            if(applyForCard.equalsIgnoreCase("yes")){
                System.out.println("We offer you a new credit card");
            }else{
                System.out.println("Thank you, You can apply next time");
            }

    }
}}
