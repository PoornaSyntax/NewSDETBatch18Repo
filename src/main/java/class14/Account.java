package class14;

public class Account {

    String accountNumber="12356789";
    private double balance=350;
    private String userName="user123";
    private String password="pass123";
    private void printInfo(){
        System.out.println(accountNumber);
    }

    void printHello(){
        System.out.println("Welcome to Bank Of America");
    }
    public void Hello(){
        System.out.println("Welcome customer");
    }

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.password);
        a.printInfo();
        MyClass n = new MyClass();

    }
    private static class MyClass{

    }
}
