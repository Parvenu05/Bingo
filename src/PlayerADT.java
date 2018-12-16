
public interface PlayerADT {

    /**
    * Generates the board for the players with numbers placed randomly
    * in their corresponding letter
    * 
    * @require board number limit to generate board numbers within a range
    * 
    * @ensure a board for the player is created
    */
    public void generateBoard(int boardNumberlimit);

    /**
    * Confirms the number that has been sent in is on board
    * 
    * @require number that has been called to confirm
    * 
    * @ensure number is confirmed and 
    * the number on the board is made into a zero
    * to be able to check if player wins later by matching zeros
    */
    public void confirmNumberOnBoard(int numberOnBoard);

}
