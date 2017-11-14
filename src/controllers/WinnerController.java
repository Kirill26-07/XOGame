/**
 * Класс проверяет победителя после каждого хода, если победитель не найден - игра продолжается, если найден
 * - объявляем победителя и заканчиваем игру!
 */

package controllers;
import model.Field;
import model.Figure;
import model.Player;
import view.ConsoleView;


class WinnerController {
        
    void getWinner(){

        String[][] winnerControlField = Field.getField();
        
        if(winnerControlField[0][0].equals(" " + Figure.X.toString()) && 
                winnerControlField[1][0].equals(" " + Figure.X.toString()) &&
                winnerControlField[2][0].equals(" " + Figure.X.toString())){

            ConsoleView.printWinner(Player.getPlayer1());
        }
        else if(winnerControlField[0][1].equals(" " + Figure.X.toString()) &&
                winnerControlField[1][1].equals(" " + Figure.X.toString()) &&
                winnerControlField[2][1].equals(" " + Figure.X.toString())){
            
            ConsoleView.printWinner(Player.getPlayer1());
        }
        else if(winnerControlField[0][2].equals(" " + Figure.X.toString()) &&
                winnerControlField[1][2].equals(" " + Figure.X.toString()) &&
                winnerControlField[2][2].equals(" " + Figure.X.toString())){

            ConsoleView.printWinner(Player.getPlayer1());
        }
        else if(winnerControlField[0][0].equals(" " + Figure.X.toString()) &&
                winnerControlField[0][1].equals(" " + Figure.X.toString()) &&
                winnerControlField[0][2].equals(" " + Figure.X.toString())){

            ConsoleView.printWinner(Player.getPlayer1());
        }else if(winnerControlField[1][0].equals(" " + Figure.X.toString()) &&
                winnerControlField[1][1].equals(" " + Figure.X.toString()) &&
                winnerControlField[1][2].equals(" " + Figure.X.toString())){

            ConsoleView.printWinner(Player.getPlayer1());
        }
        else if(winnerControlField[2][0].equals(" " + Figure.X.toString()) &&
                winnerControlField[2][1].equals(" " + Figure.X.toString()) &&
                winnerControlField[2][2].equals(" " + Figure.X.toString())){

            ConsoleView.printWinner(Player.getPlayer1());
        }
        else if(winnerControlField[0][0].equals(" " + Figure.O.toString()) &&
                winnerControlField[1][0].equals(" " + Figure.O.toString()) &&
                winnerControlField[2][0].equals(" " + Figure.O.toString())){

            ConsoleView.printWinner(Player.getPlayer2());
        }
        else if(winnerControlField[0][1].equals(" " + Figure.O.toString()) &&
                winnerControlField[1][1].equals(" " + Figure.O.toString()) &&
                winnerControlField[2][1].equals(" " + Figure.O.toString())){

            ConsoleView.printWinner(Player.getPlayer2());
        }
        else if(winnerControlField[0][2].equals(" " + Figure.O.toString()) &&
                winnerControlField[1][2].equals(" " + Figure.O.toString()) &&
                winnerControlField[2][2].equals(" " + Figure.O.toString())){

            ConsoleView.printWinner(Player.getPlayer2());
        }
        else if(winnerControlField[0][0].equals(" " + Figure.O.toString()) &&
                winnerControlField[0][1].equals(" " + Figure.O.toString()) &&
                winnerControlField[0][2].equals(" " + Figure.O.toString())){

            ConsoleView.printWinner(Player.getPlayer2());
        }else if(winnerControlField[1][0].equals(" " + Figure.O.toString()) &&
                winnerControlField[1][1].equals(" " + Figure.O.toString()) &&
                winnerControlField[1][2].equals(" " + Figure.O.toString())){

            ConsoleView.printWinner(Player.getPlayer2());
        }
        else if(winnerControlField[2][0].equals(" " + Figure.O.toString()) &&
                winnerControlField[2][1].equals(" " + Figure.O.toString()) &&
                winnerControlField[2][2].equals(" " + Figure.O.toString())){

            ConsoleView.printWinner(Player.getPlayer2());
        }
        else {
            CurrentMoveController.switchPlayers();
        }

    }

}
