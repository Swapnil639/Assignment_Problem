package com.bridgelabz;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("12345", 1000.0);
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Initial balance: " + account.getBalance());
        boolean condition = true;
        while (condition == true) {
            System.out.println();
            System.out.println("Choose option \n1.Deposit \n2.Withdraw \n3.Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    double input = scanner.nextDouble();
                    account.deposit(input);
                    System.out.println("Balance after deposit: " + account.getBalance());
                    condition = true;
                    break;
                case 2:
                    double input1 = scanner.nextDouble();
                    account.withdraw(input1);
                    System.out.println("Balance after withdrawal: " + account.getBalance());
                    condition = true;
                    break;
                case 3:
                    condition = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    condition = true;
            }
        }

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}