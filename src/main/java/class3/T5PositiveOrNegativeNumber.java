package class3;
/*
Write a program to check whether number is positive or negative.
 */

public class T5PositiveOrNegativeNumber {
    public static void main(String[] args) {
        int num = 10;// 0 is neither positive nor negative
        if(num>0){
            System.out.println("Positive");
        }else if (num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
