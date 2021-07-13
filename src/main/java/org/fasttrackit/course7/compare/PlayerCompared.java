package org.fasttrackit.course7.compare;

public class PlayerCompared extends Player implements Comparable<PlayerCompared> {
    public PlayerCompared(int rank, String name, String team) {
        super(rank, name, team);
    }

    @Override
    public int compareTo(PlayerCompared o) {
        final int rankOfThis = this.getRank();
        final int rankOfOther = o.getRank();

        // final int name = this.getName().hashCode();
        // ...
        //return rankOfThis - rankOfOther; // manual comparison calculation
        return Integer.compare(rankOfThis, rankOfOther); // library method comparison
    }
}
