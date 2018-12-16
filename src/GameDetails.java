
public class GameDetails implements GameDetailsADT {

    private static GameDetails instance = null;

    private int numberOfPlayers;
    private int gameType;

    private GameDetails() {
    }

    public static GameDetails getInstance() {
        if (instance == null) {
            instance = new GameDetails();
        }

        return instance;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }

}
