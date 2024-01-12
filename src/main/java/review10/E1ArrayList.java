package review10;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);

        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));;
        }

        for(Integer i:numbers){
            System.out.println(i);
        }


    }
}
