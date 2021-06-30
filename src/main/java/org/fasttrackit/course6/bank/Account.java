package org.fasttrackit.course6.bank;

public class Account {
    private String iban;

    Account(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }
}
