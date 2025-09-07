package com.rest.app.setting_scores.util;

public class Score {

    int wins;
    int ties;
    int loses;

    public Score() {}

    public Score(int wins, int loses, int ties) {
        super();
        this.wins = wins;
        this.loses = loses;
        this.ties = ties;
    }

    public int getTies() {
        return ties;
    }


    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
