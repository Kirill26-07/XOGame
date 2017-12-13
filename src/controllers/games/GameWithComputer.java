package controllers.games;

import controllers.CurrentMoveController;
import model.Board;
import model.Field;
import model.Figure;
import model.Player;

public class GameWithComputer extends AbstractGame {

    @Override
     void inputUsersName(){

        botLavalSettings();

        consoleView.consoleViewer("\nInput first player name - figure 'X': ");
        String firstUser = consoleReader.reader().trim();

        new Player(firstUser);
    }

    @Override
    void letsPlay(){
        Field field = new Field();

        field.fieldWithCoordinates();
        Board.printBoard();

        CurrentMoveController.setCurrentFigure(Figure.X.toString());
        CurrentMoveController.setGameWithBoot(true);

        moveController.setFigureOnField(Figure.X.toString());
    }

    private void botLavalSettings(){

        consoleView.consoleViewer("\nIf you wont to play with LOW mode - input LOW.\nIf you wont to play with Medium mode - input MD.\nIf you wont to play with Hard mode - input HD:");

        String botLaval = consoleReader.reader();

        if(botLaval.toLowerCase().equals("md")){
            consoleView.consoleViewer("\nMEDIUM mode START!");
            CurrentMoveController.setMediumBot(true);
        }
        else if(botLaval.toLowerCase().equals("hd")){
            consoleView.consoleViewer("\nHARD mode START!");
            CurrentMoveController.setHardBot(true);
        }
        else{
            consoleView.consoleViewer("\nLOW mode START!");
        }
    }
}
