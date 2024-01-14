package class24;

import java.util.HashMap;

public class E9Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> maps= new HashMap<>();

        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        //maps.forEach((k,v)-> System.out.println(k+" "+v));
        //maps.entrySet().removeIf((e->e.getKey().contains("i")));
       //maps.entrySet().removeIf((e->e.getValue()==5));
        maps.entrySet().removeIf((e->e.getValue()==5||e.getKey().contains("O")));

        System.out.println(maps);


    }
}
