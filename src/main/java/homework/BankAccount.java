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
        }
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient funds!");
            }
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
        System.out.println("Withdrawal not allowed from Fixed Deposit Account. Funds are locked until maturity.");
    }
    public void deposit(double amount) {

        super.deposit(amount);
        System.out.println("Deposit into Fixed Deposit Account");
    }

}

     class BankAccountTester {
         public static void main(String[] args) {
             BankAccount[]
                     accounts = {

                     new
                             SavingsAccount("SA001"
                             , 1000.0
                             , "John Smith"
                             , 0.05
                     ),        new
                     CheckingAccount("CA001"
                     , 2000.0
                     , "Jane Austen"
             ),        new
                     FixedDepositAccount("FDA001"
                     , 5000.0
                     , "Bob Smith"
                     , 12
             )};

             for (int i = 0; i < accounts.length; i++) {

                 BankAccount account = accounts[i];
                 System.out.println("Account Holder: "+ account.getAccountHolderName());
                 account.deposit(500.0);
                 account.withdraw(200.0);
                 System.out.println("Current Balance: $"+ account.getBalance());
                 if (account instanceof SavingsAccount) {

                     ((SavingsAccount) account).applyInterest();
                     System.out.println("Updated Balance after interest: $"+ account.getBalance());
                 }

                 System.out.println();
             }
        }
    }


