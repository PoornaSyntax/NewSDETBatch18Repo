package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String> floor=new LinkedHashMap<>();
        floor.put(1,"Google");
        floor.put(2,"Syntax");
        floor.put(3,"Google");
        floor.put(4,"Amazon");
        floor.put(5,"Apple");
        floor.put(6,"Apple");
        floor.put(7,"Samsung");
        floor.size();
        System.out.println(floor);
        floor.replace(4,"LG");
        floor.remove(7);
        floor.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
