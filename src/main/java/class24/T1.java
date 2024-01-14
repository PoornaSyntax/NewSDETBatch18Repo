package class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class T1 {
    /*
    Create a map of building. Store floor number and its associated company name
    (Example: 1 = Google, 2= Syntax etc.,) Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */
    public static void main(String[] args) {
        Map<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"AoE");
        building.put(4,"FaceBook");
        building.put(5,"Snap");
        building.put(6,"Whatsapp");
        building.put(7,"Java");
        System.out.println(building.size());
        building.replace(4,"Tagged");
        building.remove(7);
        System.out.println(building);
    }

    }

