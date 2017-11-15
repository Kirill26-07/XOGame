/** Класс реализует первоначальную конфигурацию игры
 */

package controllers;
import model.Board;
import model.Field;
import view.ConsoleView;

public class Game {

   // Первоначальная конфигурация игры
   private ConsoleView consoleView = new ConsoleView();

    public void startGame(){

        consoleView.printGameName();
        consoleView.createPlayers();
        letsPlay();
    }

    private void letsPlay(){

        Field.fieldWithCoordinates();
        Board.printBoard();
        CurrentMoveController.switchPlayers();
    }


}