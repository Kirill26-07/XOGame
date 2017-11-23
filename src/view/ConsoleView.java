/** Класс предназначен для вывода игровой информации на консоль игрокам
 */
package view;

import model.Player;

public class ConsoleView {

    // Выводим название игры
    public void printGameName(final String gameName){

        System.out.println("Hello! Welcome to our game - " + gameName);
    }

    // Создаем игроков и выводим их на экран
    public void createPlayers(){

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("\nInput first player name - figure 'X': ");
        Player.setPlayer1();

        System.out.println("\nInput second player name - figure 'O': ");
        Player.setPlayer2();

        System.out.println(stringBuilder.append("\nPlayer 1: ")
                                        .append(Player.getPlayer1())
                                        .append("\nPlayer 2: ")
                                        .append(Player.getPlayer2()));
    }

    // Вывод пользователя чей ход текущий
    public static void currentPlayerStep(final String figure){
        System.out.println("Step for player with " + figure + " figure!");
    }

    // Сообщение о том что ячейка уже занята
    public static void fieldBusy(){
        System.out.println("Field with this coordinate was busy, please, set you figure in the other field!");

    }

    // Сообщение о запросе координат
    public static void needToCoordinates(){
        System.out.println("Please, input field coordinate, where would you like to set the figure: ");
    }

    // Вывод победителя
    public static void printWinner(final String winner){

        System.out.println("Congratulations " + winner + " you are WIN!!!");

    }

}