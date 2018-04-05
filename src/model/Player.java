/**
 * Класс хранит игроков и отдает их при запросе
*/package model;


import view.ConsoleView;

public class Player {

    private final String PLAYER_NAME;

    public Player(String player_name) {
        PLAYER_NAME = player_name;
    }

    private void printPlayerName() {
        ConsoleView consoleView = new ConsoleView();
        consoleView.consolePrint(PLAYER_NAME);
    }

    public String getPlayerName() {
        return PLAYER_NAME;
    }
}
