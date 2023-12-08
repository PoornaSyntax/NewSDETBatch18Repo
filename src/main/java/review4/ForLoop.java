package review4;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=2;i<=10;i+=3){
            System.out.println(i);
        }

        // we want to print numbers from 10 till 2
        for(int i=10;i>=2;i--){
            System.out.print(i+" ");
        }
        for(int i=10;i>=2;i++){
            System.out.print(i+" ");//logical error, endless loop
        }
    }

    public static class DoWHileLoop {
        public static void main(String[] args) {
            //do while -when we dont know in advance
            //how many times we want to repeat a block of codes.
            /*
            while vs do while
            in do while block of code will be executed atleast once
             even when the condition is false.
             */
            int n = 1;
            do{
                System.out.println("Hello");
                n++;
            }while(n<=4);
        }
    }
}
