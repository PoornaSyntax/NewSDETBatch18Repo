package class1;

public class VariableValues {
    public static void main(String[] args) {
        byte  byteVar = 127;           // byte (8-bit)
        short shortVar = 32767;       // short (16-bit)
        int intVar = 2147483647;     // int (32-bit)
        long longVar = 9223372036854775807L; // long (64-bit)
        // Floating-point types
        float floatVar = 3.14159f;   // float (32-bit)
        double doubleVar = 3.14159265359; // double (64-bit)
        // Character type
        char charVar = 'A';           // char (16-bit)
        // Boolean type
        boolean boolVar = true;       // boolean
        //Updating variable values
        byteVar = 125;
        shortVar = 12345;
        intVar = 1242147647;
        longVar = 10223370895458477L;
        floatVar = 82.5f;
        doubleVar = 2.14159265359;
        boolVar = false;
        charVar = 'B';

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(boolVar);
        System.out.println(charVar);



    }
}
