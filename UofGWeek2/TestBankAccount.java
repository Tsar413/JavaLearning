package com.company.javaRelearn.UofGWeek2;

public class TestBankAccount {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jim");
        Person person2 = new Person(1,"Kate",30,"development");
        BankAccount bankAccount1 = new BankAccount(person);
        BankAccount bankAccount2 = new BankAccount(person2);
        BankAccount bankAccount3 = new BankAccount(person);
        BankAccount bankAccount4 = new BankAccount("Kate");
        System.out.println(bankAccount1.getAccountNumber());
        System.out.println(bankAccount2.getAccountNumber());

        System.out.println(bankAccount1.getBalance());
        bankAccount1.saveMoney(2.7);
        System.out.println(bankAccount1);
        bankAccount1.withdrawMoney(1);
        System.out.println(bankAccount1);
        bankAccount1.withdrawMoney(5);
        System.out.println(bankAccount1);
        System.out.println(bankAccount3);
        bankAccount2.saveMoney(1);
        bankAccount1.transferFunds(bankAccount2,1);
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);

        System.out.println("Lab4");
        SavingBankAccount savingBankAccount = new SavingBankAccount("Kate",10);
        savingBankAccount.saveMoney(20);
        savingBankAccount.saveMoney(30);
        savingBankAccount.addInterests();
        System.out.println(savingBankAccount);
    }
}
