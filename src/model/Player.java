/**
 * Класс хранит игроков и отдает их при запросе
*/
package model;

import controllers.reader.ConsoleReader;

public class Player {

    private static String PLAYER_1;
    private static String PLAYER_2;

    private static ConsoleReader consoleReader = new ConsoleReader();

    public static void setPlayer1() {

        PLAYER_1 = consoleReader.reader().trim();
    }

    public static void setPlayer2() {

        PLAYER_2 = consoleReader.reader().trim();
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
