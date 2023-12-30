package class22HW;

import java.util.ArrayList;

public class Cars {
    public static void main(String[] args) {


    ArrayList<String> cars= new ArrayList<>();
    cars.add("Toyota");
    cars.add("Honda");
    cars.add("Ford");
    cars.add("Chevrelet");
    cars.add("Nissan");
        System.out.println("Pirnting using For Loop");
    for(int i=0;i<cars.size();i++){
        System.out.println(cars.get(i));
    }
        System.out.println("**************************");
        System.out.println("Printing using Enhabced for loop");
    for(String c:cars){
        System.out.println(c);
    }
}}
