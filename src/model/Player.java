/**
 * Класс хранит игроков и отдает их при запросе
*/package model;

public class Player {

    private final String PLAYER_NAME;

    public Player(final String player_name) {
        PLAYER_NAME = player_name;
    }

    public String getPlayerName() {
        return PLAYER_NAME;
    }
}
