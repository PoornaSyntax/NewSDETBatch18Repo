package class23;

import java.util.Set;
import java.util.TreeSet;

public class T2Treeset {
    public static void main(String[] args) {
        Set<String> countrySet=new TreeSet<>();
        countrySet.add("United States");
        countrySet.add("Albania");
        countrySet.add("Canada");
        countrySet.add("Grecce");
        countrySet.add("Italy");
        System.out.println(countrySet);

        System.out.println("Using enhanced for loop");
        for(String country:countrySet){
            System.out.println(country);
        }

    }
}
