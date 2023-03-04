package chess;

import java.util.HashSet;

public class PlayerList {
    private HashSet<ChessPlayer> players = new HashSet<ChessPlayer>();
    private static PlayerList instance  = null;
    private PlayerList(){}

    public static PlayerList getInstance(){
        if(instance == null){
            instance = new PlayerList();
        }
        return instance;
    }
    public HashSet<ChessPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(HashSet<ChessPlayer> players) {
        this.players = players;
    }
}
