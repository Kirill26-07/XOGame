package controllers.games;

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
        super.letsPlay();

        moveController.setFigureOnField(Figure.X.toString());
    }

}
