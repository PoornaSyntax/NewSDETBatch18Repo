package class5;

import java.util.Scanner;

public class T2Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number from1 to 7");
        int dayNumber = sc.nextInt();
        if(dayNumber>=1&&dayNumber<=5){
            System.out.println("Week day");
        }else if(dayNumber==6 && dayNumber==7){
            System.out.println("Weekend");
        }else
            System.out.println("Invalid");
    }
}
