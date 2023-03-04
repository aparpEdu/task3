package chess;

import java.io.PrintWriter;
import java.util.*;

public class ChessHelper {
    private static  boolean available = true;
    public static void showAllPlayers(PrintWriter out){
        HashSet<ChessPlayer> players = PlayerList.getInstance().getPlayers();
        List<ChessPlayer> list = new ArrayList<>(players);
        list.sort(Comparator.comparingInt(ChessPlayer::getFideID).reversed());
    for(ChessPlayer player: list){
        out.println(player.toString());
    }
    }

    public static void showPlayer(PrintWriter out,int fideId){
        for(ChessPlayer player: PlayerList.getInstance().getPlayers()){
            if(player.getFideID() == fideId) {
                out.println(player);
            }
            }
    }
    public static void registerPlayer(PrintWriter out, int fideID,String name,String lastName,int elo){
        ChessPlayer player = new ChessPlayer();
        player.setFideID(fideID);
        player.setName(name);
        player.setLastName(lastName);
        player.setElo(elo);
        HashSet<ChessPlayer> players = PlayerList.getInstance().getPlayers();
        players.add(player);
        for(ChessPlayer chessPlayer: players){
            if(chessPlayer.getFideID() == fideID){
                out.println("Player with the fideID:" +  fideID + "Already exists");
                setAvailable(false);
            }
        }
        if(isAvailable()) {
            PlayerList.getInstance().setPlayers(players);
        }
        setAvailable(true);
    }

    public static boolean isAvailable() {
        return available;
    }

    public static void setAvailable(boolean available) {
        ChessHelper.available = available;
    }
}
