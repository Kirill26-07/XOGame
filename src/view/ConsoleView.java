/** Класс предназначен для вывода игровой информации на консоль игрокам
 */
package view;

import model.Player;

public class ConsoleView {

    // Выводим название игры
    public void printGameName(String gameName){

        System.out.println("Hello! Welcome to our game - " + gameName);
    }

    // Создаем игроков и выводим их на экран
    public void createPlayers(){

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Input first player name - figure 'X': ");
        Player.setPlayer1();

        System.out.println("Input second player name - figure 'O': ");
        Player.setPlayer2();

        System.out.println(stringBuilder.append("Player 1: ")
                                        .append(Player.getPlayer1())
                                        .append("\nPlayer 2: ")
                                        .append(Player.getPlayer2()));
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