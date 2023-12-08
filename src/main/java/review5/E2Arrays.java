package review5;

public class E2Arrays {
    public static void main(String[] args) {
        //Creating the array and initializing it(assigning a value
        int [] numbers={10,25,36,56,80};
        System.out.println(numbers.length);
        System.out.println(numbers[1]);
        for(int i=0;i<numbers.length/2;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        //Enhanced for loop always go in the forward direction
        for(int n:numbers){
            System.out.print(n+" ");
        }
    }
}
