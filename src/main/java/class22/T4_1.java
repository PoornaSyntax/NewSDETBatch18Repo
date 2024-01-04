package class22;

import java.util.ArrayList;

public class T4_1 {
    /*
    Create an arrayList of even numbers from 1 to 500 using a loop. Then write another loop to
// Remove any number that is divisible by 5 from that arrayList
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 500; i++) {
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%5==0){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
