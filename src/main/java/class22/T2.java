package class22;

import java.util.ArrayList;

public class T2 {
    /*
    create an arrayList of drinks call it. If any drink has letter "a" or "e"replacce
    the whole word with water.
     */

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Juice");
        drinks.add("Beer");
        drinks.add("Soda");
        for(int i=0;i<drinks.size();i++){
            String s = drinks.get(i);
            if(s.contains("a")||s.contains("e")){
                drinks.set(i,"water");
            }

        }
        System.out.println(drinks);
    }
}
