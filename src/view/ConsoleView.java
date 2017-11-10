/** Класс предназначен для вывода игровой информации на консоль игрокам
 */

package view;

import model.Board;
import model.Player;

import java.util.Scanner;


public class ConsoleView {

    public void printGameName(){
        System.out.println("Hello! Welcome to our game - " + Board.getGameName());

    }

    public void createPlayers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first player name - figure 'X': ");
        String player_1 = scanner.nextLine();

        System.out.println("Input second player name - figure 'O': ");
        String player_2 = scanner.nextLine();

        Player player = new Player(player_1, player_2);

        System.out.println("Player 1: " + player.getPlayer1());
        System.out.println("Player 2: " + player.getPlayer2());

    }

    public static void currentPlayerStep(final String figure){
        System.out.println("Ход игрока с фигурой " + figure);
    }

    public static void fieldBusye(){
        System.out.println("Поле с данной координатой занято, установите фигуру в другое место");
    }

    public static void needToCoordinates(){
        System.out.println("Введите координаты ячейки в которую хотите установить вашу фигуру: ");
    }



    public static void printWinner(final String winner){

        System.out.println("Congratulations " + winner + " you are WIN!!!");

    }

}