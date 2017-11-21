/**
 * Проверяем ход текущего игрока и переключаем его на следующего
 */

package controllers;
import model.Figure;

class CurrentMoveController {

    private static String currentFigure = Figure.X.toString();     // Первый игрок при запуске игры

    // Переключение игроков
    static void switchPlayers(){

        if(currentFigure.equals(Figure.X.toString())){
            currentFigure = Figure.O.toString();
            MoveController.setFigureOnField(Figure.X.toString());
        }
        else{
            currentFigure = Figure.X.toString();
            MoveController.setFigureOnField(Figure.O.toString());
        }
    }
}
