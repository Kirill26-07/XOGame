package view;
import controllers.Game;
import model.Player;

import java.util.Scanner;


public class ConsoleView {

    public static void printGameName(){
        System.out.println("Hello! Welcome to our game - " + Game.getGameName());

    }

    public void createPlayers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first player name: ");
        String player_1 = scanner.nextLine();

        System.out.println("Input second player name: ");
        String player_2 = scanner.nextLine();

        Player player = new Player(player_1, player_2);

        System.out.println("Player 1: " + player.getPlayer1());
        System.out.println("Player 2: " + player.getPlayer2());

    }


    public static void printWinner(){

    }

}