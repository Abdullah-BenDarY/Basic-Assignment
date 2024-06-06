package oop;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(50000);

        System.out.print("Client name: " + bankAccount.getName() +
                "\nClient Phone: " + bankAccount.getPhone() +
                "\nAccount number: " + bankAccount.getAccountNumber() +
                "\nAvaiable amount: " + bankAccount.getAmount());
    }
}
