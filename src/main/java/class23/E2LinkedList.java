package class23;

import java.util.LinkedList;
import java.util.List;

public class E2LinkedList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Kat");
        names.add("Aaron");
        names.add("Maria");
        names.add("Aida");
        names.remove(0);
    }
}
