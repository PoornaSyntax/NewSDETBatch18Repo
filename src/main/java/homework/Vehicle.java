package homework;

import java.util.Scanner;

/*
Create a class named Vehicle. If no arguments are passed while creating an object,
it should print "I love vehicles". IF a string representing the type of vehicle(like "Car","Bike") is
passed, it should print "I love[VehicleType]". For example, if "Car" is passed, it should print"I love Car"
 */
public class Vehicle {
    void print(){
        System.out.println("I love Vehicles");
    }
    String print(String str){
        System.out.println("I love "+str);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Press  enter the name of the vehicle");
        String str=sc.nextLine();
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        if (str.equals("")){
            v1.print();
        }else{
            v2.print(str);
        }


    }
}
