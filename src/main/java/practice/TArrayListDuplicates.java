package practice;

import java.util.ArrayList;

public class TArrayListDuplicates {
/*
How can you remove all duplicates from ArrayList?
 */


        public static void main(String[] args) {
            // Create an ArrayList with duplicates
            ArrayList<String> arrayListWithDuplicates = new ArrayList<>();
            arrayListWithDuplicates.add("apple");
            arrayListWithDuplicates.add("banana");
            arrayListWithDuplicates.add("apple");
            arrayListWithDuplicates.add("orange");
            arrayListWithDuplicates.add("banana");

            System.out.println("ArrayList with duplicates: " + arrayListWithDuplicates);

            // Remove duplicates using a for loop

            System.out.println("ArrayList without duplicates: " + arrayListWithDuplicates);



            }}




