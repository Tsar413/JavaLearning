package com.company.javaRelearn.UofGWeek2;

public class SavingBankAccount extends BankAccount {
//    private String name;
//    private int accountNumber;
//    private double balance;
//    private static int nextAccountNumber = 0;
//    private Person person;
    private double interestRate;

    SavingBankAccount() {}

    SavingBankAccount(Person person) {
        super();
//        this.person = person;
//        this.accountNumber = nextAccountNumber;
//        this.balance = 0.0;
//        nextAccountNumber++;
    }

    SavingBankAccount(String name, double interestRate) {
        super(name);
//        this.name = super.getName();
//        this.balance = super.balance;
//        this.accountNumber = super.getAccountNumber();
        this.interestRate = interestRate;
    }

//    public int getAccountNumber() {
//        return super.accountNumber;
//    }

    public double getBalance() {
        return super.balance;
    }

//    public void saveMoney(double saveMoney) {
//        balance = super.saveMoney1(saveMoney);
//    }
    public void withdrawMoney(double withdrawMoney) {
        if(balance - withdrawMoney <= 0) {
            System.out.println("Money is not enough");
        } else {
            balance -= withdrawMoney;
        }
    }

    public void transferFunds(BankAccount bankAccount, double moneyToTransfer) {
        bankAccount.saveMoney(moneyToTransfer);
        this.balance -= moneyToTransfer;
    }

    public void addInterests() {
        balance += (balance * interestRate / 100);
    }

    @Override
    public String toString() {
        return "SavingBankAccount{" +
//                "name='" + name + '\'' +
//                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
//                ", person=" + person +
                ", interestRate=" + interestRate +
                '}';
    }
}
