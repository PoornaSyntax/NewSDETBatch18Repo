package MockInterview;

public class Mock1StringSwap {
    public static void main(String[] args) {


    String firstString = "Hello";
    String secondString = "World";

            System.out.println("Before swapping:");
            System.out.println("First String: " + firstString);
            System.out.println("Second String: " + secondString);

    //1. Method:
    // Swap using concat method

    firstString = firstString + secondString;
    secondString = firstString.substring(0, firstString.length() - secondString.length()); // o,10-5=5(Hello)
    firstString = firstString.substring(secondString.length()); // HelloWorld= 5=initial index, 9=final index

            System.out.println("\nAfter swapping using concat method:");
            System.out.println("First String: " + firstString);
            System.out.println("Second String: " + secondString);


    // firstString = "World";
    // secondString = "Hello";

    //2. Method:
    // Swap using substring method

    firstString = firstString + secondString;
    secondString = firstString.substring(0, firstString.length() - secondString.length());
    firstString = firstString.substring(secondString.length());

            System.out.println("\nAfter swapping using substring method:");
            System.out.println("First String: " + firstString);
            System.out.println("Second String: " + secondString);


    // firstString = "World";
    //  secondString = "Hello";


}
    }

            // Expected Output:

