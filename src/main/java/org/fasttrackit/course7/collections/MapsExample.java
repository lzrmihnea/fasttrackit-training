package org.fasttrackit.course7.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapsExample {
    public static void main(String[] args) {
        // Hash Map with Dictionary
        System.out.println(" \n HashMap with Dictionary");
        HashMap<String, String> doom2 = new HashMap<>();
        doom2.put("pinguin", "Un animal care traieste in zone reci.");
        doom2.put("albina", "Face bazz bazz");
        doom2.put("crisalida", "Mai tarziu devine fluture");

        System.out.println(doom2);

        System.out.println(" \n Afisarea unui valorii pentru cheia \"albina\"");
        System.out.println(doom2.get("albina"));

        // Hash Map with DOOM with multiple definitions per word
        System.out.println(" \n DOOM with multiple definitions for a single word");
        HashMap<String, List<String>> doomMultipleDefs = new HashMap<>();
        List<String> defsForBroasca = new ArrayList<>();
        defsForBroasca.add("Animal pe care-l mananca francezii");
        defsForBroasca.add("Element al usii");
        doomMultipleDefs.put("broasca", defsForBroasca);

        List<String> defsForCheie = new ArrayList<>();
        defsForCheie.add("Cheia de la usa");
        defsForCheie.add("Cheia sol");
        doomMultipleDefs.put("cheie", defsForCheie);
        defsForCheie.add("Cheie franceza");

        System.out.println(doomMultipleDefs);
        System.out.println(" \n Afisarea definitiilor pentru \"cheie\"");
        System.out.println(doomMultipleDefs.get("cheie"));

        List<String> newDefsForBroasca = new ArrayList<>();
        newDefsForBroasca.add("Animal din lac");
        doomMultipleDefs.put("broasca", newDefsForBroasca);
        System.out.println(" \n Afisare DOOM cu cheia \"broasca\" actualizata cu PUT.");
        System.out.println(doomMultipleDefs);

        List<String> broascaDefsFromDoom = doomMultipleDefs.get("broasca");
        broascaDefsFromDoom.add("ce definitie noua mai vrem noi");
        System.out.println(" \n Afisare DOOM cu cheia \"broasca\" actualizata cu GET + ADD. (can be null)");
        System.out.println(doomMultipleDefs);

        System.out.println(doomMultipleDefs.get("yala"));

    }
}
