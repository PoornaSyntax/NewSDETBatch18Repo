package homework;

class BankAccount_Tester {
    public static void main(String[] args) {
        BankAccount[]
                accounts = {new SavingsAccount("SA001", 1000.0, "John Smith",
                0.05),
                new CheckingAccount("CA001", 2000.0, "Jane Austen"),
                new FixedDepositAccount("FDA001", 5000.0, "Bob Smith",
                        12)};

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


