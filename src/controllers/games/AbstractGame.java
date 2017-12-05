
/** Класс реализует первоначальную конфигурацию игры
 */

package controllers.games;
import controllers.MoveController;
import view.ConsoleView;


abstract class AbstractGame{

    private static final String GAME_NAME = "XO-GAME";
    MoveController moveController = new MoveController();
    ConsoleView consoleView = new ConsoleView();

    // Первоначальная конфигурация игры
    public void startGame() {

        // Выводим название игры
        consoleView.consoleViewer("Hello! Welcome to our game - " + GAME_NAME);
        inputUsersName();
        letsPlay();
    }

    // Принимаем имена пользователей и выводим их на экран
    abstract void inputUsersName();

    abstract void letsPlay();
}
