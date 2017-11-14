/** Класс хранит название игры и фигурки
 */
package model;

public class Board {


    // Фигуры и название игры

    private static final String GAME_NAME = "XO-GAME";


    public static String getGameName() {
        return GAME_NAME;
    }

    // Принтим доску с фигурками на экран

    public static void printBoard(){

        StringBuilder stringBuilder = new StringBuilder();

        String[][] boardForPrint = Field.getField();

        System.out.println(stringBuilder
                .append("\n")
                .append(" " + boardForPrint[0][0])
                .append(" |")
                .append(" " + boardForPrint[0][1])
                .append(" |")
                .append(" " + boardForPrint[0][2])
                .append("\n")
                .append("--------------")
                .append("\n")
                .append(" "+ boardForPrint[1][0])
                .append(" |")
                .append(" " + boardForPrint[1][1])
                .append(" |")
                .append(" " + boardForPrint[1][2])
                .append("\n")
                .append("--------------")
                .append("\n")
                .append(" " + boardForPrint[2][0])
                .append(" |")
                .append(" " + boardForPrint[2][1])
                .append(" |")
                .append(" " + boardForPrint[2][2])
                .append("\n"));
    }
}

