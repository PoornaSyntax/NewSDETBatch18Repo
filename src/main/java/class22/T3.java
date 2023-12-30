package class22;

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Carlosa");
        words.add("Kim Jong Una");
        words.add("Nazir");
        words.add("Sherif");
        words.removeIf(x->x.endsWith("a"));
        System.out.println(words);
        //words.forEach(x->System.out.println(x));

        /*
        for(int i=0;i<words.size();i++){
        if(words.get(i).endsWith("a")){
           words.remove(i);
           i--;
        }
        }
        System.out.println(words);
         */
    }
}
