package section5;

import java.util.Scanner;

public class AccountTransactions {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accountNumber = sc.next();
        System.out.println("Enter the Account Balance");
        int balance = sc.nextInt();
        System.out.println("Enter 1 to deposit account, 2 to withdraw account");
        int choice = sc.nextInt();
        Account acc = new Account(accountNumber, balance);
        if (choice == 1) {
            System.out.println("Enter the amount to be deposited");
            int deposit = sc.nextInt();
            acc.deposit(deposit);
        }
        if (choice == 2) {
            System.out.println("Enter the amount to withdraw");
            int withdraw = sc.nextInt();
            acc.withdraw(withdraw);
        }
    }

}
