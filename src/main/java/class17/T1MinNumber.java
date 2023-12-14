package class17;

public class T1MinNumber {
    /*
    Create a method to find the minimum of two numbers. Method will be passed two parameters and will return
    the minimum number. Method should work with int and double data types.
     */

    public static int minimum(int num1, int num2){
        if(num1<num2){
            return num1;

        }else{
            return num2;
        }

    }
    public static double minimum(double num1,double num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }

}
