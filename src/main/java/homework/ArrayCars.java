package homework;
/*
Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
 */

public class ArrayCars {
    public static void main(String[] args) {

        String[] cars={"Lexus","Toyota","Honda","BMW","Tesla","Nissan"};

        System.out.println("Printing the values using For Loop");
        for(int i=0;i<cars.length;i++){
            System.out.print(cars[i]+" ");
        }

        int i = 0;
        System.out.println();
        System.out.println();
        System.out.println("Printing the values using while loop");
        while(i<cars.length){
            System.out.print(cars[i]+" ");
            i++;
        }




    }
}
