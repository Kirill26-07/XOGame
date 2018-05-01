/** Класс реализует первоначальную конфигурацию игры
 */
package controllers.games;

import controllers.CurrentMoveController;
import controllers.MoveController;
import controllers.reader.ConsoleReader;
import model.Board;
import model.Field;
import model.Figure;
import model.Player;
import view.ConsoleView;

abstract class AbstractGame{

    private static final String GAME_NAME = "XO-GAME";
    final MoveController moveController = new MoveController();
    final ConsoleView consoleView = new ConsoleView();
    final ConsoleReader consoleReader = new ConsoleReader();

    final Player[] players;

    AbstractGame(final Player[] players) {
        this.players = players;
    }

    // Первоначальная конфигурация игры
    public final void startGame() {
        // Выводим название игры
        consoleView.consolePrint("\nHello! Welcome to our game - " + GAME_NAME);
        letsPlay();
    }

    void letsPlay() {
        MoveController.field = new Field(new String[3][3]);
        Board.printBoard();
        CurrentMoveController.setCurrentFigure(Figure.X.toString());
    }
}
