package class7;

public class E10Arrays {
    public static void main(String[] args) {
        int [] numbers={10,25,44,33,56};

        System.out.println();
        int sum = 0;
        for(int i=0;i<5;i++){
            //System.out.println(numbers[i]);
            sum = sum+numbers[i];
        }
        System.out.println("Sum = "+sum);

    }
}
