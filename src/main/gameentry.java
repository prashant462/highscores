package main;

import java.util.Arrays;

public class gameentry {
    public String name;
    public int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void gameentry(String name,int score) {
        this.name = name;
        this.score = score;
    }



    public string toString()
    {

    }

}
class Scoreboard
{
    private int numEntries=0;
    private gameentry[] board;
    public Scoreboard(int capacity)
    {
       board = new gameentry[capacity];
    }
        public void add(gameentry gameentry)
        {
            int newScore=gameentry.score;
            if(numEntries<board.length || newScore > board[numEntries-1].score)
            {
                if(numEntries<board.length)
            }
            Arrays.sort(board);
            if (gameentry.score >  board[0].score)
            {
                board[0]=gameentry;
            }

        }
        public void remove(int index)
        {

        }

    public static void main(String[] args) {
        Scoreboard scoreboard=new Scoreboard(5)
    }
}
