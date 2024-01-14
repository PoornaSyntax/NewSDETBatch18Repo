package class24;

import java.util.TreeMap;

public class T3 {
    /*
    Create a Person class with following private fields:name, lastName, age,s alary.
    Variables should be initialized through constructor
    Inside the class also create a method to print user details
    In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each details.
    Example of key 1,2,3 etc.
     */
    public static void main(String[] args) {
        TreeMap<Integer, Person> pers= new TreeMap<>();
        pers.put(1,new Person("Farid","F",26,3000));
        pers.put(2,new Person("Rauf","R",26,4000));
        pers.put(3,new Person("Alim","A",27,5000));
        pers.put(4,new Person("Yodgor","Y",28,6000));
        pers.forEach((key,personObj)->{
            System.out.println("id:"+key);
            personObj.printInfo();
        });
    }
}
