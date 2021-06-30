package org.fasttrackit.course6.bank;

public class BankingApp {
    public static void main(String[] args) {
        Person p1 = new Person("Ramona", "ROING1010");
        Person p2 = new Person("Doru", "ROBT1019");

        System.out.println(p1.calculateBankAccountHash());
        System.out.println(p2.calculateBankAccountHash());
    }
}
