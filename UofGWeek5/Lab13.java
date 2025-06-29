package com.company.javaRelearn.UofGWeek5;

public class Lab13 {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(1,"Alice", 23, "Development");

        BankAccount account = new BankAccount("Alice");
        account.saveMoney(20);
        System.out.println(account);
        SavingBankAccount account1 = new SavingBankAccount("Alice", 2.0);
        account1.saveMoney(20);

        account1.withdrawMoney(30);

        System.out.println(account1);
    }
}
