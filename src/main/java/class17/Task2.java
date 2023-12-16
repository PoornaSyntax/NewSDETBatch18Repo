package class17;

public class Task2 {
    public static void main(String[] args) {
        add(10,20);
        add(99,99.9);
        add(77,88,99);
    }
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int b,double a){
        System.out.println(b+a);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
