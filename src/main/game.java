package main;

public class game {
    public static void main(String[] args) {
        gameentry gameentry= new gameentry(name: "Prashant",score:100);
        Scoreboard scoreboard=new Scoreboard(capacity:5);
        scoreboard.add();
    }
}
