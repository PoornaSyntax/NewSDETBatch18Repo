package class23;

import java.util.LinkedHashSet;
import java.util.Set;

public class T3 {
    /*
    create a Set of cities in which you want to make sure that
    insertion order is maintained. Then remove any city that starts
    with "A"
     */
    public static void main(String[] args) {
        Set<String> c=new LinkedHashSet<>();
        c.add("Alabama");
        c.add("Boston");
        c.add("New York");
        c.add("Atlanta");
        c.removeIf(x->x.startsWith("A"));
//        for(String str:c){
//            if(str.startsWith("A")){
//                c.remove(str);
//            }
//        }
        System.out.println(c);
    }
}
