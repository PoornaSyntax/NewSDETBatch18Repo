package class14;

public class T2 {
    /*
    Create a method that will accept an array as parameter and will return a sum of all
    elements from that array. Method should be visible only within same package and
    accessible by creating an instance/object of the class.
     */


        int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        public static void main(String[] args) {
            // Example usage:
            int[] numbers = {1, 2, 3, 4, 5};

            // Creating an instance of the class
            T2 calculator = new T2();

            // Calling the package-private method
            int result = calculator.calculateSum(numbers);

            // Displaying the result
            System.out.println("Sum of elements: " + result);
        }
    }


