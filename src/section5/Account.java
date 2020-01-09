package section5;

public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getbalance() {
        return balance;
    }

    public void deposit(int deposit) {
        this.balance = balance + deposit;
        System.out.println("Your Balance after the transaction is" + getbalance());
    }

    public void withdraw(int transactionAmount) {
        if (transactionAmount > this.balance) {
            System.out.println("Insufficient Balance \n" + "\n"
                    + "Your balance after Transaction is" + getbalance());
        } else {
            this.balance = this.balance - transactionAmount;
            System.out.println("Insufficient Balance \n" + "\n"
                    + "Your balance after Transaction is" + getbalance());
        }
    }
}
