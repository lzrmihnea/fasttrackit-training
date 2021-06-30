package org.fasttrackit.course6.bank;

public class Person {
    private String name;
    private Account bankAccount;

    public Person(String personName, String accountIban) {
        this.name = personName;
        this.bankAccount = new Account(accountIban);
    }

    public String getName() {
        return name;
    }

    public Account getBankAccount() {
        return bankAccount;
    }
    public int calculateBankAccountHash() {
        int bankAccountHashCode = this.bankAccount.hashCode();
        return this.hashCode() + bankAccountHashCode;
    }
}
