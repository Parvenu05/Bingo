
public interface BoardADT {
    
    /**
    * Generates numbers from 1 to the boardNumberLimit
    * 
    * @require need a board number limit as an int.
    * 
    * @ensure A list of numbers is generated
    * and placed in a list, then shuffled to simulate randomness.
    */
    public void generateNumbers(int boardNumberLimit);

    /**
    * Calls out numbers
    * 
    * @require list of numbers
    * 
    * @ensure Numbers are called taken from list
    */
    public int callNumbers();

    /**
    * Confirms winners
    * 
    * @require player and their board as well as the type of game being played
    * 
    * @ensure the winner is returned
    */
    public boolean confirmWinner(PlayerControl player, int typeOfGame);

}
