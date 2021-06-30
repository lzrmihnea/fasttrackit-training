package org.fasttrackit.course6.animal;

public class Animal {
    String name; // field level scope

    String talk() {
        String whatToTalk = "shhh ";
        return whatToTalk;
    }
}
