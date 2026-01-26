
public class Account {
    private String name;
    private int balance;
    private String accountNo;

    public Account(String name, String phoneNo) {
        this.name = name;
        this.balance = 0;
        this.accountNo = phoneNo.substring(1); //sets phone number as account number
    };


    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }
}