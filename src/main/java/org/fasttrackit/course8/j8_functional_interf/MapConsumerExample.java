package org.fasttrackit.course8.j8_functional_interf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapConsumerExample {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        emailList.add("abc@gmail.com");
        emailList.add("xyz@gmail.com");
        emailList.forEach(email -> System.out.println(email));

        Map<Integer, String> idToEmail = new HashMap<>();
        idToEmail.put(12, "1@yahoo.com");
        idToEmail.put(34, "4@yahoo.com");
        idToEmail.forEach((id, email) -> {
            System.out.println("id is " + id);
            System.out.println("email is " + email);
        });

    }
}
