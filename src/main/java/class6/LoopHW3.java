package class6;
/*
print even numbers from 20 to 1(ising
2 different loops
 */
public class LoopHW3 {
    public static void main(String[] args) {
        System.out.println("Using for loop");
        for(int i =20;i>=1;i=i-2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("using do while loop");
        int i =20;
        do{
            System.out.print(i+" ");
            i=i-2;
        }while(i>=2);
        System.out.println();
        System.out.println("using while loop");
        int j = 20;

        while(j>=1){
            System.out.print(j+" ");
            j=j-2;
        }

    }
}
