package class22;

import java.util.ArrayList;

public class T1 {
    /*
    Create an array list that wills tore 5 names in to it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arraylist and print all values from htat.
     */
    public static void main(String[] args) {


    ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        names.add("Nasima");
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.contains("Kamla"));
        System.out.println(names);







}}
