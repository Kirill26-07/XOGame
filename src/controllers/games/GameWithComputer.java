package controllers.games;

import controllers.reader.ConsoleReader;
import model.Player;

public class GameWithComputer extends Game{

    @Override
    protected void inputUsersName(){

        StringBuilder stringBuilder = new StringBuilder();
        ConsoleReader consoleReader = new ConsoleReader();

        consoleView.consoleViewer("\nInput first player name - figure 'X': ");
        String firstUser = consoleReader.reader().trim();

        new Player(firstUser);

        consoleView.consoleViewer(stringBuilder.append("\nPlayer 1: ")
                .append(Player.getPlayer1())
                .append("\nPlayer 2: ")
                .append(Player.getPlayer2()));
    }
}
