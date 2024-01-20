package review11;

import java.util.LinkedHashMap;

public class E3Maps {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> studentsMap= new LinkedHashMap<>();
        studentsMap.put("John",95);
        studentsMap.put("Adam",88);
        studentsMap.put("Muh",92);
        studentsMap.put("KAt",91);
        studentsMap.put("KAri",90);
        System.out.println(studentsMap);
        //if the name of the student contains the letter or if marks are less than 90 remove those
        studentsMap.entrySet().removeIf(x->x.getValue()<=90||x.getKey().contains("a"));
        System.out.println(studentsMap);

    }
}
