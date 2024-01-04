package class22;

import java.util.ArrayList;

public class T4 {
    /*
    Create an arrayList of even numbers from 1 to 500 using a loop. Then write another loop to
// Remove any number that is divisible by 5 from that arrayList
     */



        public static void main(String[] args) {
            // Create an ArrayList to store even numbers
            ArrayList<Integer> evenNumbersList = new ArrayList<>();

            // Populate the ArrayList with even numbers from 1 to 500
            for (int i = 2; i <= 500; i += 2) {
                evenNumbersList.add(i);
            }

            // Print the original list
            System.out.println("Original List of Even Numbers: " + evenNumbersList);

            // Remove numbers divisible by 5 using removeIf
            evenNumbersList.removeIf(number -> number % 5 == 0);

            // Print the updated list
            System.out.println("List after removing numbers divisible by 5: " + evenNumbersList);
        }
    }



