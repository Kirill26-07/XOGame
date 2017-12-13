/*
 * Проверяем ход текущего игрока и переключаем его на следующего
 */

package controllers;
import controllers.bot.BotMoveController;
import controllers.bot.HardBotMoveController;
import controllers.bot.MediumBotMoveController;
import model.Figure;

public class CurrentMoveController {

    private static String currentFigure;                    // Первый игрок при запуске игры
    private static boolean gameWithBoot = false;
    private static boolean mediumBot = false;
    private static boolean hardBot = false;
    private static MoveController moveController = new MoveController();
    private static BotMoveController botMoveController = new BotMoveController();
    private static MediumBotMoveController mediumBotMoveController = new MediumBotMoveController();
    private static HardBotMoveController hardBotMoveController = new HardBotMoveController();

    // Переключение игроков
    static void switchPlayers(){

        if(currentFigure.equals(Figure.X.toString()) && !gameWithBoot){
            currentFigure = Figure.O.toString();
            moveController.setFigureOnField(Figure.O.toString());
        }
        else if(currentFigure.equals(Figure.X.toString()) && gameWithBoot && !hardBot){
            currentFigure = Figure.O.toString();
            botMoveController.setFigureOnField(Figure.O.toString());
        }
        else if(currentFigure.equals(Figure.X.toString()) && gameWithBoot && mediumBot) {
            currentFigure = Figure.O.toString();
            mediumBotMoveController.setFigureOnField(Figure.O.toString());
        }
        else if(currentFigure.equals(Figure.X.toString()) && gameWithBoot && hardBot){
            currentFigure = Figure.O.toString();
            hardBotMoveController.setFigureOnField(Figure.O.toString());
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

    public static String getCurrentFigure() {
        return currentFigure;
    }

    public static void setHardBot(boolean hardBot) {
        CurrentMoveController.hardBot = hardBot;
    }

    public static void setMediumBot(boolean mediumBot) {
        CurrentMoveController.mediumBot = mediumBot;
    }

    static boolean isHardBot() {
        return hardBot;
    }

    public static boolean isMediumBot() {
        return mediumBot;
    }
}
