package class14;

public class StaticMethod {
    static int dValue(int num){
        return num*2;
    }

    public static void main(String[] args) {

        System.out.println(StaticMethod.dValue(10));
    }
}
