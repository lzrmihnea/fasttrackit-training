package org.fasttrackit.course10;

public class _02AgeExceptionRunner {
    public static void main(String[] args) {

        try{
            System.out.println("1. Am deschis un fisier pentru citire. " +
                    "Trebuie sa-l inchidem.");
            System.out.println("1.1. " + getAgeInMonths("33"));
            System.out.println("2. Putem inchide fisierul.");
        } catch(NumberFormatException nfe) {
            System.out.println("3. Numar gresit");
        } finally {
            System.out.println("4. S-a inchis fisierul!");
        }

        System.out.println("5. Programul s-a incheiat cu succes!");
    }

    private static int getAgeInMonths(String ageText) {
        Integer ageInt = Integer.parseInt(ageText);
        if(ageInt < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        return ageInt * 12;
    }
}
