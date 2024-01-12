package class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E8Collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);

        LinkedHashSet<Integer> uniqueNumber=new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumber);
        TreeSet<Integer> treeSet=new TreeSet<>(uniqueNumber);
        System.out.println(treeSet);
    }
}
