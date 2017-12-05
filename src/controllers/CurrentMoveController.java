/**
 * Проверяем ход текущего игрока и переключаем его на следующего
 */

package controllers;
import model.Figure;

public class CurrentMoveController {

    private static String currentFigure;     // Первый игрок при запуске игры
    private static boolean gameWithBoot = false;
    private static MoveController moveController = new MoveController();
    private static BotMoveController botMoveController = new BotMoveController();

    // Переключение игроков
    static void switchPlayers(){

        if(currentFigure.equals(Figure.X.toString()) && !gameWithBoot){
            currentFigure = Figure.O.toString();
            moveController.setFigureOnField(Figure.O.toString());
        }
        else if(currentFigure.equals(Figure.X.toString()) && gameWithBoot){
            currentFigure = Figure.O.toString();
            botMoveController.setFigureOnField(Figure.O.toString());
        }
        else{
            currentFigure = Figure.X.toString();
            moveController.setFigureOnField(Figure.X.toString());
        }
    }

    public static void setCurrentFigure(String currentFigure) {
        CurrentMoveController.currentFigure = currentFigure;
    }

    public static void setGameWithBoot(boolean gameWithBoot) {
        CurrentMoveController.gameWithBoot = gameWithBoot;
    }
    static String getCurrentFigure() {
        return currentFigure;
    }

}
