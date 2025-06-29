package com.company.javaRelearn.UofGWeek2;

public class BankAccount {
    private String name;
    private int accountNumber;
    protected double balance;
    private static int nextAccountNumber = 0;
    private Person person;

    BankAccount() {}

    BankAccount(String name) {
        super();
        this.name = name;
        this.accountNumber = nextAccountNumber;
        this.balance = 0.0;
        nextAccountNumber++;
    }

    BankAccount(Person person) {
        super();
        this.person = person;
        this.accountNumber = nextAccountNumber;
        this.balance = 0.0;
        nextAccountNumber++;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void saveMoney(double saveMoney) {
        balance += saveMoney;
    }
    public double saveMoney1(double saveMoney) {
        return balance += saveMoney;
    }
    public void withdrawMoney(double withdrawMoney) {
        balance -= withdrawMoney;
//        if(balance - withdrawMoney <= 0) {
//            System.out.println("Money is not enough");
//        } else {
//            balance -= withdrawMoney;
//        }
    }

    public void transferFunds(BankAccount bankAccount, double moneyToTransfer) {
        bankAccount.saveMoney(moneyToTransfer);
        this.balance -= moneyToTransfer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person='" + person + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
