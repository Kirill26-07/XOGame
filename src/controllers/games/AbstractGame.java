
/** Класс реализует первоначальную конфигурацию игры
 */

package controllers.games;
import controllers.CurrentMoveController;
import controllers.MoveController;
import controllers.reader.ConsoleReader;
import model.Board;
import model.Field;
import model.Figure;
import view.ConsoleView;


abstract class AbstractGame{

    private static final String GAME_NAME = "XO-GAME";
    MoveController moveController = new MoveController();
    ConsoleView consoleView = new ConsoleView();
    ConsoleReader consoleReader = new ConsoleReader();

    // Первоначальная конфигурация игры
    public void startGame() {

        // Выводим название игры
        consoleView.consoleViewer("Hello! Welcome to our game - " + GAME_NAME);
        inputUsersName();
        letsPlay();
    }

    // Принимаем имена пользователей и выводим их на экран
    abstract void inputUsersName();

    void letsPlay(){
        Field field = new Field();

        field.fieldWithCoordinates();
        Board.printBoard();
        CurrentMoveController.setCurrentFigure(Figure.X.toString());
    }

}
