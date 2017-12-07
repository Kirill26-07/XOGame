package controllers.games;

import controllers.CurrentMoveController;
import model.Board;
import model.Field;
import model.Figure;
import model.Player;

public class GameWithPlayer extends AbstractGame {

    @Override
    void inputUsersName() {

        consoleView.consoleViewer("\nInput first player name - figure 'X': ");
        String firstUser = consoleReader.reader().trim();

        consoleView.consoleViewer("\nInput second player name - figure 'O': ");
        String secondUser = consoleReader.reader().trim();

        new Player(firstUser, secondUser);

    }

    @Override
    void letsPlay() {
        Field field = new Field();

        field.fieldWithCoordinates();
        Board.printBoard();

        CurrentMoveController.setCurrentFigure(Figure.X.toString());
        moveController.setFigureOnField(Figure.X.toString());
    }

}
