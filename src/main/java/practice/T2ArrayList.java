package practice;


import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("coffee");
        drinks.add("Tea");
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("pop");

        for (int i=0;i<drinks.size();i++){
            String s = drinks.get(i);
            if(s.contains("a")){
                drinks.set(i,"Water");
            }

        }
        System.out.println(drinks);


    }
}
