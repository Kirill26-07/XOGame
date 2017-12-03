// Start GAME!!!

import controllers.games.Game;
import controllers.games.GameWithComputer;
import controllers.reader.ConsoleReader;
import view.ConsoleView;

public class Main {

    // Запуск игры
    public static void main(String[] args) {

        ConsoleView consoleView = new ConsoleView();
        ConsoleReader consoleReader = new ConsoleReader();

        // Выбор варианта игры - с другим игроком или компьютером
        consoleView.consoleViewer("\nPress 1 to play with friends, press 2 to play with computer!");
        final int youChoise = Integer.parseInt(consoleReader.reader().trim());

        switch(youChoise){

            case 1:{
                Game game = new Game();
                game.startGame();
                break;
            }
            case 2:{
                Game gameWithComputer = new GameWithComputer();
                gameWithComputer.startGame();
                break;
            }
            default:{
                consoleView.consoleViewer("You input wrong value, please try again!");
            }
        }
    }
}
