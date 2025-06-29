package com.company.javaRelearn.UofGWeek5;

class CheckEmpty extends Exception {
    static boolean checkEmpty(double withdrawMoney, double balance) throws Exception {
        if (balance - withdrawMoney < 0) {
            System.out.println("Try again");
            throw new Exception();
        } else {
            return true;
        }
    }
}

public class SavingBankAccount extends BankAccount {
    private double interestRate;

    SavingBankAccount() {}

    SavingBankAccount(Person person) {
        super();
    }

    SavingBankAccount(String name, double interestRate) {
        super(name);
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return super.getAccountNumber();
    }

    public double getBalance() {
        return super.balance;
    }

    public void withdrawMoney(double withdrawMoney) throws Exception {
        if(CheckEmpty.checkEmpty(withdrawMoney, balance)) {
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

