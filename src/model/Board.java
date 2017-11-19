/**
 * Выводит игровую доску с фигурками и координатами в консоль
 */
package model;

public class Board {

    // Принтим доску с фигурками на экран
    public static void printBoard(){

        StringBuilder stringBuilder = new StringBuilder();

        String[][] boardForPrint = Field.getField();

        System.out.println(stringBuilder
                .append("\n").append(" ").append(boardForPrint[0][0])
                .append(" |").append(" ").append(boardForPrint[0][1])
                .append(" |").append(" ").append(boardForPrint[0][2])
                .append("\n")
                .append("--------------")
                .append("\n").append(" ").append(boardForPrint[1][0])
                .append(" |").append(" ").append(boardForPrint[1][1])
                .append(" |").append(" ").append(boardForPrint[1][2])
                .append("\n")
                .append("--------------")
                .append("\n").append(" ").append(boardForPrint[2][0])
                .append(" |").append(" ").append(boardForPrint[2][1])
                .append(" |").append(" ").append(boardForPrint[2][2])
                .append("\n"));
    }
}

