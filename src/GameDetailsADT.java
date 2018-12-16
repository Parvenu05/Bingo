/**
 *
 * @author ng5122xf
 */
public interface GameDetailsADT {

    /**
    * Gets number of players
    * 
    * @require user input of how many players to play against
    * 
    * @ensure number is retrieved from input
    */
    public int getNumberOfPlayers();

    /**
    * Sets number of players playing
    * 
    * @require an int is needed to set number of players
    * 
    * @ensure Number of players user is playing against is set
    */
    public void setNumberOfPlayers(int numberOfPlayers);

    /**
    * Retrieves the gameType
    * 
    * @require retrieves gameType
    * 
    * @ensure gameType in the form of an int is returned to be used
    */
    public int getGameType();

    /**
    * Sets the gameType to be played
    * 
    * @require gameType in form of an int is required to be used
    * 
    * @ensure the gameType is set and used
    */
    public void setGameType(int gameType);
    
}
