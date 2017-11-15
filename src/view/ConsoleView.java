/** Класс предназначен для вывода игровой информации на консоль игрокам
 */

package view;

import model.Board;
import model.Player;

import java.util.Scanner;


public class ConsoleView {

    // Выводим название игры
    public void printGameName(){
        System.out.println("Hello! Welcome to our game - " + Board.getGameName());

    }

    // Создаем игроков и выводим их на экран
    public void createPlayers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first player name - figure 'X': ");
        String player_1 = scanner.nextLine().trim();

        System.out.println("Input second player name - figure 'O': ");
        String player_2 = scanner.nextLine().trim();

        scanner.close();

        new Player(player_1, player_2);

        System.out.println("Player 1: " + Player.getPlayer1());
        System.out.println("Player 2: " + Player.getPlayer2());

    }

    // Вывод пользователя чей ход текущий
    public static void currentPlayerStep(final String figure){
        System.out.println("Ход игрока с фигурой " + figure);
    }

    // Сообщение о том что ячейка уже занята
    public static void fieldBusye(){
        System.out.println("Поле с данной координатой занято, установите фигуру в другое место");
    }

    // Сообщение о запросе координат
    public static void needToCoordinates(){
        System.out.println("Введите координаты ячейки в которую хотите установить вашу фигуру: ");
    }

    // Вывод победителя
    public static void printWinner(final String winner){

        System.out.println("Congratulations " + winner + " you are WIN!!!");

    }

}