package class5;
/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
 */

import java.util.Scanner;

public class T4BirthdaySeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Birth month");
        String monthName = sc.next();
        String season;

        if(monthName.equals("March")||
                monthName.equalsIgnoreCase("April")||
                monthName.equals("May")){
            System.out.println("Spring");
        }else if(monthName.equals("June")||monthName.equals("July")||monthName.equals("August")){
            System.out.println("Summer");
        }else if(monthName.equals("September")||monthName.equals("October")||monthName.equals("November")){
            System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }
    }

}
