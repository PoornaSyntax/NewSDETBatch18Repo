package project;

public class Q9ArraySecondLargest {
    public static void main(String[] args) {
        double [][] array={
                {-654,321,48,32,9},
                {3,84,-31,87},
                {264,989,-359,64,189,74},
                {6546,31,847,7,64}
        };
        //define the smallest possible and biggest possible
        double minusInfinity=-1.0/0.0;
        //Loop find the firstBiggest
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j]>=minusInfinity){
                    minusInfinity=array[i][j];
                }
            }
        }
        //Save the value of the firstBiggest
        double firstBiggest=minusInfinity;
        //Another loop to find the firstBiggest index in the array
        //And change it to the smallest possible
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j]==firstBiggest){
                    array[i][j]=-1.0/0.0; //Turns FirstBiggest into smallest
                }
            }
        }
        //After the firstBiggest changed to smallest...
        // Another loop to find the secondBiggest
        double secondBiggest=-1.0/0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j]>=secondBiggest){
                    secondBiggest=array[i][j];
                }
            }
        }
        System.out.println("The second biggest number in the array is "+secondBiggest);

    }
}
