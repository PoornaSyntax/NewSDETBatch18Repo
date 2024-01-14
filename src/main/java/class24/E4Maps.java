package class24;

import java.util.ArrayList;
import java.util.HashMap;

public class E4Maps {
    public static void main(String[] args) {

        //HashMap<String,Integer> fruit= new HashMap<();>
        HashMap<String,Integer> maps= new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        //Set<String> keys = maps.keySet();
        var keys = maps.keySet();
        //Collection<String> keys = maps.keySet();
        var arrayList=new ArrayList<>(keys);
        for(var k:keys){
            System.out.println(k);
        }




}}
