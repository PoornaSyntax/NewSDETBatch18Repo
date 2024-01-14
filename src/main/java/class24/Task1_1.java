package class24;

import java.util.ArrayList;

public class Task1_1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fah");
        names.add("Maria");
        names.add("Ray");
        names.add("Hay");
        names.add("Jay");
        names.forEach(e-> System.out.println(e));
        System.out.println("***************");
        names.forEach(e-> {
            if(e.contains("a")) {
                System.out.println(e);
            }
        });

        names.removeIf(d->d.length()>3);
        System.out.println(names);


    }
}
