package project;

public class T9 {
    public static void main(String[] args) {


    int [][] array={
            {-654,321,48,32,9},
            {3,84,-31,87},
            {264,989,-359,64,189,74},
            {6546,31,847,7,64}
    };

    double minusInfinity=-1.0/0.0;
    int firstBiggest=0;

        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j]>minusInfinity){
                minusInfinity=array[i][j];
            }
        }
    }
    firstBiggest=(int)minusInfinity;
    minusInfinity=-1.0/0.0;
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if(array[i][j]>minusInfinity){
                if(array[i][j]==firstBiggest){
                    continue;
                }
                minusInfinity=array[i][j];
            }
        }
    }
        System.out.println("The Second biggest number is "+minusInfinity);
}}
