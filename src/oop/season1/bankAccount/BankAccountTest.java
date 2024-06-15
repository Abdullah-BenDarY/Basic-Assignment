package oop.season1.bankAccount;

import java.util.Scanner;

public class BankAccountTest {
    public static BankAccount bankAccount = new BankAccount();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i <= 100; i++) {
            System.out.print("Please chose a service to go: " +
                    "\n 1- Withdraw" +
                    "\n 2- Deposit" +
                    "\n 3- Balance");
            int service = scanner.nextInt();
            switch (service) {
                case 1:
                    System.out.println("Please enter an amount");
                    int withdrawAmount = scanner.nextInt();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Please enter an amount");
                    int depositAmount = scanner.nextInt();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Your balance is: " + bankAccount.getBalance());
                    break;

            }
        }
    }
}
