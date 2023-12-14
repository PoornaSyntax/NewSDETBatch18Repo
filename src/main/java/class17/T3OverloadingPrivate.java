package class17;

public class T3OverloadingPrivate {
    /*
    Create 1 class with a private method that has 3 overloaded forms.Then call each
    overloaded method with specific arguments and observe the result.
     */

    private void M1(String s){
        System.out.println("Method overloaded with string parameter called :"+s);
    }

    private void  M1(int num){
        System.out.println("Method overloaded with integer parameter Called :"+num);
    }
    private void M1(double num){
        System.out.println("Method overloaded with double parameter called :"+num);
    }

    public static void main(String[] args) {
        T3OverloadingPrivate obj=new T3OverloadingPrivate();
        obj.M1("Java Programming");
        obj.M1(10);
        obj.M1(4.5);

    }

}
