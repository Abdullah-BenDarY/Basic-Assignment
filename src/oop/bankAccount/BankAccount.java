package oop.bankAccount;

public class BankAccount {

    private int accountId;
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public BankAccount() {
        balance =0;
    }

    public void withdraw(int withdrawAmount){
        if (balance >= withdrawAmount && withdrawAmount > 0){
            balance = balance - withdrawAmount;
            System.out.println("Your withdraw amount is: " + withdrawAmount +
                    "\nCurrent balance is: " + balance );
        }else {
            System.out.println("Sorry, Available balance is not enough");
        }
    }

    public void deposit(int deposit){
        if (deposit > 0) {
            balance = balance + deposit;
            System.out.println("Your current balance is: " + balance);
        }else {
            System.out.println("Please enter a valid number");
        }
    }

    public int getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}


