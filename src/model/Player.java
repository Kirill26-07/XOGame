/**
 * Класс хранит игроков и отдает их при запросе
*/
package model;

import view.ConsoleView;

public class Player {

    private static String PLAYER_1;
    private static String PLAYER_2;


    // Создаем игроков
    public Player(final String player_1){
        this(player_1, "Computer");

    }
    public Player(final String player_1, final String player_2){

        PLAYER_1 = player_1;
        PLAYER_2 = player_2;

        printPlayers();
    }

    private void printPlayers(){
        StringBuilder stringBuilder = new StringBuilder();
        ConsoleView consoleView = new ConsoleView();

        consoleView.consoleViewer(stringBuilder.append("\nPlayer 1: ")
                .append(Player.getPlayer1())
                .append("\nPlayer 2: ")
                .append(Player.getPlayer2()));

    }

    // Возвращаем 1 игрока
    public static String getPlayer1() {
        return PLAYER_1;
    }

    // Возвращаем 2 игрока
    public static String getPlayer2() {
        return PLAYER_2;
    }
}
