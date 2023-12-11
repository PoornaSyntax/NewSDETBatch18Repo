package class14;

public class T3ReverseString {
/*
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
 */
        public static String string(String str){
           String reverseWord="";
            for (int i = str.length()-1; i >=0 ; i--) {
                reverseWord= reverseWord+str.charAt(i);

            }
            return reverseWord;
        }
        public static void main(String args[]) {
            //;
            T3ReverseString  obj = new T3ReverseString();
            String x=obj.string("Java");
            System.out.println(x);

        }
    }


