package class17;
public class T2Overloading {
    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call
    each overloaded method with specific arguments and observe result.
     */
        public static void printInfo(int number) {
            System.out.println("Integer argument: " + number);
        }
        public static void printInfo(double number) {
            System.out.println("Double argument: " + number);
        }
        public static void printInfo(String message) {
            System.out.println("String argument: " + message);
        }
        public static void main(String[] args) {
            T2Overloading.printInfo(42);
            T2Overloading.printInfo(3.14);
            T2Overloading.printInfo("Hello, Java!");
        }
    }


