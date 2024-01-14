package class24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW {
    public static void main(String[] args) {


    Map<Integer,String> items = new HashMap<>();
    items.put(1234, "Printer");
    items.put(5678, "TV");
    items.put(7819, "DishWasher");
    items.put(1230, "Refrigerator");
        Set<Map.Entry<Integer, String>> entries = items.entrySet();
        for(Map.Entry<Integer,String>e:entries){
            int key = e.getKey();
            String value=e.getValue();
            System.out.println(key+" - "+value);
        }
}}