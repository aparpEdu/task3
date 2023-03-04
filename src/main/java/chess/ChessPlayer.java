package chess;

public class ChessPlayer {
    private int fideID;
    private String name;
    private String lastName;
    private int elo;

    public int getFideID() {
        return fideID;
    }

    public void setFideID(int fideID) {
        this.fideID = fideID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    @Override
    public String toString() {
        return "ChessPlayer{" +
                "fideID=" + fideID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", elo=" + elo +
                '}';
    }
}
