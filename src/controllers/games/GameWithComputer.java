package controllers.games;

import controllers.CurrentMoveController;
import model.Figure;
import model.Player;

public class GameWithComputer extends AbstractGame {

    public GameWithComputer(final Player[] players) {
        super(players);
    }

    @Override
    void letsPlay() {
        botLavalSettings();
        super.letsPlay();

        CurrentMoveController.setGameWithBoot(true);
        moveController.setFigureOnField(Figure.X.toString());
    }

    private void botLavalSettings() {
        consoleView.consolePrint("\nIf you wont to play with LOW mode - input LOW.\nIf you wont to play with Medium mode - input MD.\nIf you wont to play with Hard mode - input HD:");

        String botLaval = consoleReader.reader();

        switch (botLaval.toLowerCase()) {
            case "md": {
                consoleView.consolePrint("\nMEDIUM mode START!");
                CurrentMoveController.setMediumBot(true);
                break;
            }
            case "hd": {
                consoleView.consolePrint("\nHARD mode START!");
                CurrentMoveController.setHardBot(true);
                break;
            }
            default: {
                consoleView.consolePrint("\nLOW mode START!");
                CurrentMoveController.setLowBot(true);
                break;
            }
        }
    }
}
