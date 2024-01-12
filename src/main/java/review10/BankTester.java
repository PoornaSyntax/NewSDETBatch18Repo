package review10;

public class BankTester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1200,"username123","pass123");
        b.setBalance(4500);
        System.out.println(b.getBalance());

    }
}
