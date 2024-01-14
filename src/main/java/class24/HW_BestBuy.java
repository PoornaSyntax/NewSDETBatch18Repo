package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class HW_BestBuy {
    /*
    Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        Map<Integer,String> item = new LinkedHashMap<>();
        item.put(7664847,"Printer");
        item.put(7879885,"TV");
        item.put(7888889,"Camera");
        item.put(8001873,"XBOX");
        item.put(8232456,"Home Theater");

       /* for(var bb : item.entrySet()){
            System.out.println(bb);
        }

        */
        /*for (Map.Entry<Integer, String> bb : item.entrySet()) {
            System.out.println(bb);
        }

         */
        item.forEach((k,v)-> System.out.println(k+" = "+v));
    }
}
