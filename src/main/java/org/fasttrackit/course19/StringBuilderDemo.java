package org.fasttrackit.course19;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String asd = "asd";
        String newString = asd + "def";
        String newString2 = newString + 4;

        // Using builder pattern
        StringBuilder sb = new StringBuilder();
        sb.append("asd ")
                .append("def ")
                .append(4);

        sb.append(" ");
        sb.append("xyz");

        System.out.println(sb.toString());
    }
}
