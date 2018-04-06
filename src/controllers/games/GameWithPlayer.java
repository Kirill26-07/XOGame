package controllers.games;

import model.Figure;
import model.Player;

public class GameWithPlayer extends AbstractGame {

    public GameWithPlayer(final Player[] players) {
        super(players);
    }

    @Override
    void letsPlay() {
        super.letsPlay();
        moveController.setFigureOnField(Figure.X.toString());
    }
}
