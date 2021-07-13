package org.fasttrackit.course7;

public class BreakVsContinue {

    public static void main(String[] args) {

        for(int i =1 ; i < 30 ; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("Post i = " + i);
        }


    }
}
