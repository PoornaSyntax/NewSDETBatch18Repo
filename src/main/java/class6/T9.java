package class6;

public class T9 {
    public static void main(String[] args) {
        //write a loop to add forst 10 numbers from
        //1 to 10 = 1+2+3+4+5+6+7+8+9+10=55

        int i =0;
        int sum=0;
        while(i<=10){
            sum = sum + i;
            i++;

        }
        System.out.println("The sum of first 10 numbers is :"+sum);

        System.out.println("Using for loop");
        sum = 0;

        for(int j=1;j<=10;j++){
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
