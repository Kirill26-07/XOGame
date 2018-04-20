package controllers;

import controllers.games.GameWithComputer;
import controllers.games.GameWithPlayer;
import controllers.reader.ConsoleReader;
import model.Player;
import view.ConsoleView;

public class Settings {

    private final ConsoleReader consoleReader = new ConsoleReader();
    private final ConsoleView consoleView = new ConsoleView();
    static final WinnerController winnerController = new WinnerController();

    public void userSettings() {
        // Выбор варианта игры - с другим игроком или компьютером
        consoleView.consolePrint("\nPush 1 to play with friends, push 2 to play with computer!");

        final String youChoice = consoleReader.reader().trim();

        switch (youChoice) {
            case "1": {
                GameWithPlayer gameWithPlayer = new GameWithPlayer(createUsers(false));
                gameWithPlayer.startGame();
                break;
            }
            case "2": {
                GameWithComputer gameWithComputer = new GameWithComputer(createUsers(true));
                gameWithComputer.startGame();
                break;
            }
            default: {
                consoleView.consolePrint("You input wrong value, please try again!");
                userSettings();
            }
        }
    }

    private Player[] createUsers(final boolean withComputer) {
        String firstUser;
        String secondUser;

        if (!withComputer) {
            consoleView.consolePrint("\nInput first player name - figure 'X': ");
            firstUser = consoleReader.reader().trim();

            consoleView.consolePrint("\nInput second player name - figure 'O': ");
            secondUser = consoleReader.reader().trim();
        } else {
            consoleView.consolePrint("\nInput your name - figure 'X': ");
            firstUser = consoleReader.reader().trim();
            secondUser = "Bot";
        }

        Player[] players = new Player[]{
                new Player(firstUser),
                new Player(secondUser)
        };

        printUsersName(players);
        winnerController.setPlayers(players);
        return players;
    }

    private void printUsersName(final Player[] players) {
        StringBuilder sb = new StringBuilder().append("\nFirst player - ")
                                                .append(players[0].getPlayerName())
                                                .append("\nSecond player - ")
                                                .append(players[1].getPlayerName());
        consoleView.consolePrint(sb);
    }
}
