package com.company;

public class GameEntry {
    private String name;  //name of the person earning the score
    private int score;    //the score value.

    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }
    /**Returns the name field. */
    public String getName() {
        return name;
    }
    /**Returns the score field*/
    public int getScore() {
        return score;
    }
    /**Returns string representation of this entry*/
    public String toString(){
        return "("+ name + "," + score +")";
    }
}
