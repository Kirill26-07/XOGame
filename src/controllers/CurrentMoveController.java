/**
 * Проверяем ход текущего игрока и переключаем его на следующего
 */

package controllers;
import model.Figure;

class CurrentMoveController {

    private static String currentFigure = "X";     // Первый игрок при запуске игры

    // Переключение игроков
    static void switchPlayers(){

        if(currentFigure.equals(Figure.X.toString())){
            currentFigure = "O";
            MoveController.setFigureOnField(Figure.X.toString());
        }
        else{
            currentFigure = "X";
            MoveController.setFigureOnField(Figure.O.toString());
        }
    }
}
