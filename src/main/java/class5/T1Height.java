package class5;

import java.util.Scanner;

public class T1Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the height in inches");
        double height = sc.nextDouble();

        if (height<60){
            System.out.println("short");
        }else if(height>=60 &&height<=72){
            System.out.println("Medium");
        }else if(height>72){
            System.out.println("Tall");
        }
    }




}
