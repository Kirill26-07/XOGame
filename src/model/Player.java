/**
 * Класс хранит игроков и отдает их при запросе
*/
package model;


import java.util.Scanner;

public class Player {

    private static String PLAYER_1;
    private static String PLAYER_2;

    private static Scanner scanner = new Scanner(System.in);

    public static void setPlayer1() {

        PLAYER_1 = scanner.nextLine().trim();
    }

    public static void setPlayer2() {

        PLAYER_2 = scanner.nextLine().trim();
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
