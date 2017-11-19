/** Класс реализует первоначальную конфигурацию игры
 */

package controllers;
import model.Board;
import model.Field;
import view.ConsoleView;

public class Game{

    private static final String GAME_NAME = "XO-GAME";

    // Первоначальная конфигурация игры

    private ConsoleView consoleView = new ConsoleView();

    public void startGame(){

        consoleView.printGameName(GAME_NAME);
        consoleView.createPlayers();
        letsPlay();
    }

    private void letsPlay(){

        Field.fieldWithCoordinates();
        Board.printBoard();
        CurrentMoveController.switchPlayers();
    }
}