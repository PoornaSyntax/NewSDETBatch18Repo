package homework;
/*
Create an array of animals and store 5 elements into it.
 Using 2 different loops print all elements from the array.
 */

public class ArrayAnimals {
    public static void main(String[] args) {
        String[] animals={"Dog","Cat","Tiger","Lion","Elephant"};

        System.out.println("Printing using while loop");
        int i =0;

        while(i<animals.length){
            System.out.print(animals[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println();
        System.out.println("Printing using For Loop");
        for(int j =0; j<=animals.length-1;j++){
            System.out.print(animals[j]+" ");
        }


    }
}
