package org.fasttrackit.course8.immutable;

import java.time.LocalDate;
import java.util.Date;

public class ImmutableExample {

    public static void main(String[] args) {
        // Strings are immutable
        String someText = "   Ana are mere    ";

        String modifiedString = someText.replace("a", "b");
        String trimmedString = someText.trim();

        System.out.println("old string: " + someText);
        System.out.println("modified string: " + modifiedString);
        System.out.println("trimmed string: " + trimmedString);

        String asd = "asd";
        asd.replace("a", "z");
        System.out.println(asd); // it will still print 'asd'
        String newString = asd.replace("a", "g");
        System.out.println(newString); // it will print 'gsd'

        // Wrapper classes (Integer, Long, Double, etc.) are immutable
        Integer someInt = 12; // Autoboxing (from primitive to wrapper)

        // LocalDate classes
        LocalDate someDay = LocalDate.now();
        LocalDate plusTwoDays = someDay.plusDays(2);

        System.out.println(someDay); // remains unchanged, set to now
        System.out.println(plusTwoDays); // 2 days into the future
    }
}
