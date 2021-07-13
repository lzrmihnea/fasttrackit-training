package org.fasttrackit.course7.compare;

public class Player { // does not extend Comparable interface
    private int rank;
    private String name;
    private String team;

    public Player(int rank, String name, String team) {
        this.rank = rank;
        this.name = name;
        this.team = team;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
