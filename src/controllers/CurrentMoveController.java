/*
 * Проверяем ход текущего игрока и переключаем его на следующего
 */

package controllers;
import controllers.bot.BotMoveController;
import controllers.bot.HardBotMoveController;
import controllers.bot.MediumBotMoveController;
import model.Figure;

import java.io.Serializable;

public class CurrentMoveController {

    private static String currentFigure;                    // Первый игрок при запуске игры
    private static boolean gameWithBoot = false;
    private static boolean lowBot = false;
    private static boolean mediumBot = false;
    private static boolean hardBot = false;
    private static final MoveController moveController = new MoveController();
    private static final BotMoveController botMoveController = new BotMoveController();
    private static final MediumBotMoveController mediumBotMoveController = new MediumBotMoveController();
    private static final HardBotMoveController hardBotMoveController = new HardBotMoveController();

    // Переключение игроков
    static void switchPlayers() {

        if (currentFigure.equals(Figure.X.toString()) && !gameWithBoot) {
            currentFigure = Figure.O.toString();
            moveController.setFigureOnField(Figure.O.toString());
        } else if (currentFigure.equals(Figure.X.toString()) && gameWithBoot && !hardBot) {
            currentFigure = Figure.O.toString();
            botMoveController.setFigureOnField(Figure.O.toString());
        } else if (currentFigure.equals(Figure.X.toString()) && gameWithBoot && mediumBot) {
            currentFigure = Figure.O.toString();
            mediumBotMoveController.setFigureOnField(Figure.O.toString());
        } else if (currentFigure.equals(Figure.X.toString()) && gameWithBoot && hardBot) {
            currentFigure = Figure.O.toString();
            hardBotMoveController.setFigureOnField(Figure.O.toString());
        } else {
            currentFigure = Figure.X.toString();
            moveController.setFigureOnField(Figure.X.toString());
        }
    }

    public static void setCurrentFigure(final String currentFigure) {
        CurrentMoveController.currentFigure = currentFigure;
    }

    public static void setGameWithBoot(final boolean gameWithBoot) {
        CurrentMoveController.gameWithBoot = gameWithBoot;
    }

    public static String getCurrentFigure() {
        return currentFigure;
    }

    public static void setHardBot(final boolean hardBot) {
        CurrentMoveController.hardBot = hardBot;
    }

    public static void setMediumBot(final boolean mediumBot) {
        CurrentMoveController.mediumBot = mediumBot;
    }

    public static void setLowBot(final boolean lowBot) {
        CurrentMoveController.lowBot = lowBot;
    }

    static boolean isHardBot() {
        return hardBot;
    }

    public static boolean isMediumBot() {
        return mediumBot;
    }

    public static boolean isLowBot() {
        return lowBot;
    }
}
