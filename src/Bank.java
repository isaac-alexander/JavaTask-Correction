// Write a Java program to create a class called "Bank" with a collection of accounts
// and methods to add and remove accounts, and to deposit and withdraw money.
// Also define a class called "Account" to maintain account details of a particular customer.


import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public void depositMoney(Account account, int amount) {
        int newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
    }

    public void withdrawMoney(Account account, int amount ) {
        int newBalance = account.getBalance() - amount;
        account.setBalance(newBalance);
    }

    public void displayAccounts() {
//        this.accounts.forEach(account -> System.out.println(account.getName() + " " + account.getBalance()));
        for (Account ac : this.accounts) {
            System.out.println(ac.getName() + " " + ac.getAccountNo() + " " + ac.getBalance());
        }
    }

}