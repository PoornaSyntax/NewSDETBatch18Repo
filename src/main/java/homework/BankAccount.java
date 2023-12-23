package homework;

public class BankAccount {
    /*
    )Banking System Task: Design a BankAccount class with subclasses
    SavingsAccount, CheckingAccount, and FixedDepositAccount.

Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
Create objects of each type, store them in a list, and perform operations like depositing and
 withdrawing funds.
     */
        private String accountNumber;
        private double balance;
        private String accountHolderName;

        public BankAccount(String accountNumber, double balance, String accountHolderName) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.accountHolderName = accountHolderName;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Balance after deposit : $"+balance);
        }
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
                System.out.println("Balance after withdraw : $"+balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        }

        public void printInfo(){
            System.out.println("Name of account holder : "+accountHolderName+" Account no. "+accountNumber+" Current balance : "+balance);
        }
    }

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        //System.out.println("Interest Applied: $" + interest);
        System.out.println("Interest Applied: $" + interest + ", Updated Balance: $" + getBalance());

    }
    public void withdraw(double amount) {

        super.withdraw(amount);
        System.out.println("Withdrawal from Savings Account");
    }
    @Override
    public void deposit(double amount) {

        super.deposit(amount);
        System.out.println("Deposit into Savings Account");
    }


}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }

    public void deposit(double amount) {

        super.deposit(amount);
        System.out.println("Deposit into checking Account");
    }
    public void withdraw(double amount) {

        super.withdraw(amount);
        System.out.println("Withdrawal from checking Account");
    }


}

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, String accountHolderName, int maturityPeriod) {
        super(accountNumber, balance, accountHolderName);
        this.maturityPeriod = maturityPeriod;
    }
    public void withdraw(double amount) {
        if (maturityPeriod > 0) {
            System.out.println("Withdrawal not allowed from Fixed Deposit Account. Funds are locked until maturity.");
        } else {
            super.withdraw(amount);
            System.out.println("Withdrawal from Fixed Deposit Account");
        }
    }
    public void deposit(double amount) {

        super.deposit(amount);
        System.out.println("Deposit into Fixed Deposit Account");
    }

}

     class BankAccountTester {
         public static void main(String[] args) {
             SavingsAccount sA=new SavingsAccount("SA001",10500.89,"John Smith",4.5);
             sA.printInfo();
             sA.deposit(4500);

             sA.withdraw(3500);
             sA.applyInterest();

             System.out.println("***************************************");

             CheckingAccount cA=new CheckingAccount("CA001",5000.50,"Paul Lee");
             cA.printInfo();
             cA.deposit(2000);
             cA.withdraw(800);

             System.out.println("*****************************************");

             FixedDepositAccount fD=new FixedDepositAccount("FDA001",15500.37,"John Moore",0);
             fD.printInfo();
             fD.deposit(2550);
             fD.withdraw(5000);
        }
    }


