package com.company;

public class ScoreBoard {
    private int numEntries = 0; //number of actual entries
    private GameEntry[] board;  //array of game entries (names & scores)

    /** Constructs an empty scoreboard with the given capacity for
     * storing entries*/
    public ScoreBoard(int capacity){
        board = new GameEntry[capacity];
    }
    //More methods will go here.
    public void add(GameEntry e){
        int newScore = e.getScore();

        if (numEntries < board.length || newScore > board[numEntries-1].getScore()){
            if (numEntries < board.length)
                numEntries++;

            int j = numEntries - 1;
            while ( j>0 && board[j-1].getScore() < newScore){
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;
        }
    }
    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if (i<0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = board[i]; //Save the object to be removed
        for (int j = i;j< numEntries - 1;j++) //Count up from i (not down)
            board[j]=board[j+1];  //move out the old last score
    }
}



