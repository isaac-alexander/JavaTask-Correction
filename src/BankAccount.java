// 20. Write a Java program to create a class called "BankAccount" with attributes for account number, account holder's name, and balance. Include methods for depositing and withdrawing money, as well as checking the balance. Create a subclass called "SavingsAccount" that adds an interest rate attribute and a method to apply interest.


public class BankAccount {
    public String accountNumber;
    public String accountName;
    public int balance;

    public BankAccount(String accountName, String accountNumber) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
    }

    public void depositMoney(int amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdrawMoney(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance");
        }
    }


    public void displayBalance() {
        System.out.println("Account Name: " + this.accountName  + " Account Number: " + this.accountNumber + " Account Balance: " + this.balance);
    }
}
