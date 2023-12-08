package class9;

public class T4GroceryList {
    public static void main(String[] args) {
        /*
        Using 2D array create a grocery list.
        Inside you should have an array of veggies,fruits,dairy and sweets
        Retrieve all values from that array
        using 2 different loops
         */
        String[][] groceryList = {
                {"Carrot", "Broccoli", "Spinach","beans"},
                {"Apple", "Banana", "Orange", "plums"},
                {"Milk", "Cheese", "Yogurt"},
                {"Chocolate", "Baklava", "Cookies"}
        };
        System.out.println();
        System.out.println("Grocery List  : Using For Next Loop");
        for (int row = 0; row < groceryList.length; row++) {
            for (int col = 0; col < groceryList[row].length; col++) {
                System.out.print(groceryList[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Grocery List  : Using Enhanced For Loop");
        for(String[] n:groceryList){
            for(String items:n){
                System.out.print(items+ " ");
            }
            System.out.println();

        }

    }
}
