package interview;

public class ArrayEnhanced {
    public static void main(String[] args) {


    int[] numbers = {10,25,35,30,30,45,45};
    int previous = numbers[0];
    boolean isSorted= true;
    for(int current:numbers)

    {
        if (previous > current) {
            isSorted = false;
            break;
        }
        previous = current;
    }
        System.out.println("is array sorted "+isSorted);
    }


}
