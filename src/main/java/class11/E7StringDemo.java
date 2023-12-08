package class11;

public class E7StringDemo {
    public static void main(String[] args) {
        //It's called method chaining
        String str ="    HELLO   ";
        //System.out.println(str.toLowerCase().trim().length());
        System.out.println(str.toLowerCase().length());
        System.out.println(str.trim().toLowerCase().equals("hello"));
    }
}
