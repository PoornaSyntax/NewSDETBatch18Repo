package class6;
/*
print odd numbers between 20 and 50
(using 2 different loops)
 */

public class LoopHW4 {
    public static void main(String[] args) {

       System.out.println("Using for loop");

        for(int i=20;i<=50;i++){
           if(i%2!=0){
               System.out.print(i+" ");
           }
        }
        System.out.println();
        System.out.println("Using while loop");
        int i = 20;
       while(i<=50){
           if(i%2!=0) {
               System.out.print(i + " ");
           }
           i++;
       }
    }
}
