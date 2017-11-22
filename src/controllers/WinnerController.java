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

    // Проверяем победителя путем проверки полей с фигурками, если победитель найден - выводим, нет - продолжаем
    void getWinner() {

        boolean haveWinner = false;

        String[][] winnerControlField = Field.getField();

        for (int i = 0; i < 3; i++){

            int horizontalO = 0;
            int horizontalX = 0;

            for (int j = 0; j < 3; j++){
                if(winnerControlField[i][j].trim().equals(Figure.X.toString())){
                    horizontalX++;
                    if(horizontalX == 3){
                        ConsoleView.printWinner(Player.getPlayer1());
                        haveWinner = true;
                        break;
                    }
                }
                if(winnerControlField[i][j].trim().equals(Figure.O.toString())){
                    horizontalO++;
                    if(horizontalO == 3){
                        ConsoleView.printWinner(Player.getPlayer2());
                        haveWinner = true;
                        break;
                    }
                }

            }
        }

        if(!haveWinner){
            CurrentMoveController.switchPlayers();
        }

    }

}
