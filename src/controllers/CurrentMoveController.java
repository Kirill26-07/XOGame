/**
 * Проверяем ход текущего игрока и переключаем его на следующего
 */

package controllers;
import model.Figure;

class CurrentMoveController {

    private static String currentFigure;     // Первый игрок при запуске игры

    // Переключение игроков
    static void switchPlayers(){

        if(currentFigure.equals(Figure.X.toString())){
            currentFigure = Figure.O.toString();
            MoveController.setFigureOnField(Figure.O.toString());
        }
        else{
            currentFigure = Figure.X.toString();
            MoveController.setFigureOnField(Figure.X.toString());
        }
    }

    public static String getCurrentFigure() {
        return currentFigure;
    }

    public static void setCurrentFigure(String currentFigure) {
        CurrentMoveController.currentFigure = currentFigure;
    }
}
