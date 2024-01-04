package class22;

public class BankAccount {
    private double balance;
    private String userName;
    private String password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Login to Bank account");
    }

    void transferFunds(){

        System.out.println("Transfering funds");

    }

    void resetPassword(){
        System.out.println("Resetting the password");

    }

    public double getBalance(){
        return balance;
    }

   void setBalance(double balance){
       this.balance=balance;
   }
}
