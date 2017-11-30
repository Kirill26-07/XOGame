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

public class Game {

    protected static final String GAME_NAME = "XO-GAME";

    // Первоначальная конфигурация игры

    protected ConsoleView consoleView = new ConsoleView();

    public void startGame() {

        // Выводим название игры
        consoleView.consoleViewer("Hello! Welcome to our game - " + GAME_NAME);

        inputUsersName();
        letsPlay();
    }

    // Принимаем имена пользователей и выводим их на экран
    protected void inputUsersName() {
        StringBuilder stringBuilder = new StringBuilder();
        ConsoleReader consoleReader = new ConsoleReader();

        consoleView.consoleViewer("\nInput first player name - figure 'X': ");
        String firstUser = consoleReader.reader().trim();

        consoleView.consoleViewer("\nInput second player name - figure 'O': ");
        String secondUser = consoleReader.reader().trim();

        new Player(firstUser, secondUser);

        consoleView.consoleViewer(stringBuilder.append("\nPlayer 1: ")
                .append(Player.getPlayer1())
                .append("\nPlayer 2: ")
                .append(Player.getPlayer2()));
    }

    protected void letsPlay() {

        Field.fieldWithCoordinates();
        Board.printBoard();
        CurrentMoveController.setCurrentFigure(Figure.X.toString());
        MoveController.setFigureOnField(Figure.X.toString());
    }
}