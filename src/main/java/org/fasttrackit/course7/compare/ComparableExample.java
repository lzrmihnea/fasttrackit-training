package org.fasttrackit.course7.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        System.out.println(" \n Players with natural comparison (already implementing Comparable)");
        PlayerCompared p1 = new PlayerCompared(2, "Ronaldo", "Juvestus");
        PlayerCompared p2 = new PlayerCompared(1, "Messi", "Barca");
        PlayerCompared p3 = new PlayerCompared(3, "Neymar", "PSG");
        List<PlayerCompared> dreamTeam = new ArrayList<>();
        dreamTeam.add(p1);
        dreamTeam.add(p2);
        dreamTeam.add(p3);

        System.out.println("\n Before sorting: " + dreamTeam);
        Collections.sort(dreamTeam); // p1.compareTo(p2); p2.compareTo(p3); ...
        System.out.println(" After sorting: " + dreamTeam);

        TreeSet<PlayerCompared> playerSortedTree = new TreeSet<>();
        playerSortedTree.add(p1);
        playerSortedTree.add(p2);
        playerSortedTree.add(p3);
        System.out.println(" \nAlready sorted tree of players");
        System.out.println(playerSortedTree);

        System.out.println(" \n Players without natural comparison (NOT implementing Comparable)");
        Player playa1 = new Player(17, "Rakitic", "Croatia");
        Player playa2 = new Player(6, "Mbape", "Franta");
        Player playa3 = new Player(10, "Morata", "Spania");
        TreeSet<Player> playerCustomSortedTree = new TreeSet<>(new PlayerCustomComparatorByName());
        playerCustomSortedTree.add(playa1);
        playerCustomSortedTree.add(playa2);
        playerCustomSortedTree.add(playa3);
        System.out.println(playerCustomSortedTree);
    }
}
