package class4;
/*create a java program that will ask
user to input city and temperature. Your program should convert
Fahrenheit into celsius and print "The temperature in the city---
is---"
 */

import java.util.Scanner;

public class T5TemperatureConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city");
        String city = sc.nextLine();
        System.out.println("Enter the temperature in "+city);
        double temp = sc.nextDouble();
        double tempInCelcius = (temp-32)*5.0/9.0;
        System.out.println("The temperature in "+city+ " is "+  tempInCelcius);



    }
}
