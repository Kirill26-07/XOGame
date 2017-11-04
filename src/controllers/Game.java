package controllers;
import model.Player;

public class Game {

    private static final String GAME_NAME = "XO-GAME";
    private static final String FIGURE_X = "X";
    private static final String FIGURE_O = "O";

    public static String getGameName() {
        return GAME_NAME;
    }

    public static String getFigureX() {
        return FIGURE_X;
    }

    public static String getFigureO() {
        return FIGURE_O;
    }
}