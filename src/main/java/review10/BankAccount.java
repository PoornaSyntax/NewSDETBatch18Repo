package review10;

public class BankAccount {
    private double balance;
    private String userName;
    private String password;

    public BankAccount(double balance,String userName,String password){
        if(balance<0){
            System.out.println("Wrong Balance amount");
            setuserName(userName);
            setPassword(password);
        }
        {
            this.balance = balance;
        }
    }
    public void transferFunds(double amountToTransfer){
        balance = balance-amountToTransfer;
    }
    double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance<0){
            System.out.println("Wrong Balance Number");
            this.balance=0;
        }else{
            this.balance=balance;
        }
    }

    public void setuserName(String userName){
        if(userName.length()<4){
            System.out.println("UserName should be more than 4 characters");
        }else {
            this.userName= userName;
        }
    }
    void setPassword(String password){
        this.password=password;
    }
}
