package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class BestBuyHW {
    public static void main(String[] args) {
        Map<Integer,String> item = new LinkedHashMap<>();
        item.put(7664847,"Printer");
        item.put(7879885,"TV");
        item.put(7888889,"Camera");
        item.put(8001873,"XBOX");
        item.put(8232456,"Home Theater");


        item.forEach((k,v)-> System.out.println(k+" = "+v));
    }
}
