package class24;

import java.util.TreeMap;

public class T2 {
    /*
    Create a map of countries(5) with its capital that will sotre
    countries in alphabetical order. Country names will be keys and capitals will be values.
    Print all keys and values from a country map using for each loop or lLambda
    Print all values from a country map is for each loop or Lambda
     */
    public static void main(String[] args) {
        TreeMap<String, String> countries =new TreeMap();
        countries.put("India","New Delhi");
        countries.put("USA","Washington D.C");
        countries.put("Canada ","Ottawa");
        countries.put("Germany","Berlin");
        countries.put("Japan","Tokyo");
        countries.forEach((k,v)-> System.out.println(v));
        countries.forEach((k,v)-> System.out.println(k));

    }
}
