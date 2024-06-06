package oop;

public class BankAccount {
    private String name;
    private int accountNumber;
    private int amount;
    private String phone;

    public BankAccount() {
    }

    public BankAccount(int amount) {
        this.amount = amount;
        accountNumber = 541541;
        name = "Abdullah";
        phone = "015444444444";

    }


    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public String getPhone() {
        return phone;
    }
}

