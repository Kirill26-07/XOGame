/** Класс реализует управление игровым процессом
 */

package controllers;
import model.Board;
import model.Field;
import view.ConsoleView;

public class Game {

    private Board board = new Board();
   private ConsoleView consoleView = new ConsoleView();

    public void startGame(){

        consoleView.printGameName();
        consoleView.createPlayers();
        letsPlay();
    }

    private void letsPlay(){

        Field.fieldWithCoordinates();
        board.printBoard();
        CurrentMoveController.switchPlayers();
    }


}