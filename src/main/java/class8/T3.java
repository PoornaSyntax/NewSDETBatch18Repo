package class8;

public class T3 {
    public static void main(String[] args) {
        //
        int[] numbers={101,100,25,30,25,50,300};
        // to count how many numbers are divisible by
        //5 and how many are divisible by 2
        int num5=0,num2=0;

        for(int n:numbers){
            if(n%5==0){
                num5++;
            }
            if(n%2==0){
                num2++;
            }
        }
        System.out.println("Numbers divisible by 5 are : "+num5);
        System.out.println("Numbers divisible by 2 are : "+num2);
    }
}
