package class4;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is the largest among" +num1+" "+num2+" and "+num3);
            }

        }else{
            if(num2>num3){
                System.out.println("Num2 is largest "+num2);
            }else{
                System.out.println("Num3 is largest "+num3);
            }
        }
    }
}
