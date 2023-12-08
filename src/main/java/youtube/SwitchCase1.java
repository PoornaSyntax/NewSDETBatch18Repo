package youtube;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch(n%2) {
            case 0:
                System.out.println("even");
                break;
            //case 1:
            //    System.out.println("odd");
            default:
                System.out.println("odd");
        }
    }
}
