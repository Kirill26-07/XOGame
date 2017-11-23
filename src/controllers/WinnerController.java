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

    private final static int WINNER_VALUE = 3;

    // Проверяем победителя путем проверки полей с фигурками, если победитель найден - выводим, нет - продолжаем
    void getWinner() {

        boolean haveWinner = false;

        String[][] winnerControlField = Field.getField();

        // Проверка победителя по горизонтали и вертикали
        for (int i = 0; i < 3; i++) {

            if(haveWinner){
                break;
            }

            int horizontal_O = 0;
            int horizontal_X = 0;

            int vertical_X = 0;
            int vertical_O = 0;

            int diagonal_X = 0;
            int diagonal_O = 0;

            int overDiagonal_X = 0;
            int overDiagonal_O = 0;

            for (int j = 0; j < 3; j++) {

                // По горизонтали
                if (winnerControlField[i][j].trim().equals(Figure.X.toString())) {
                    horizontal_X++;
                    if (horizontal_X == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer1());
                        haveWinner = true;
                        break;
                    }
                }
                if (winnerControlField[i][j].trim().equals(Figure.O.toString())) {
                    horizontal_O++;
                    if (horizontal_O == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer2());
                        haveWinner = true;
                        break;
                    }
                }

                // По вертикали
                if (winnerControlField[j][i].trim().equals(Figure.X.toString())) {
                    vertical_X++;
                    if (vertical_X == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer1());
                        haveWinner = true;
                        break;
                    }
                }
                if (winnerControlField[j][i].trim().equals(Figure.O.toString())) {
                    vertical_O++;
                    if (vertical_O == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer2());
                        haveWinner = true;
                        break;
                    }
                }

                // Проверяем диоганали
                if (winnerControlField[j][j].trim().equals(Figure.X.toString())) {
                    diagonal_X++;
                    if (diagonal_X == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer1());
                        haveWinner = true;
                        break;
                    }
                }
                if (winnerControlField[j][j].trim().equals(Figure.O.toString())) {
                    diagonal_O++;
                    if (diagonal_O == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer2());
                        haveWinner = true;
                        break;
                    }
                }
                if (winnerControlField[j][(j -2)*-1].trim().equals(Figure.X.toString())) {
                    overDiagonal_X++;
                    if (overDiagonal_X == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer1());
                        haveWinner = true;
                        break;
                    }
                }
                if (winnerControlField[j][(j -2)*-1].trim().equals(Figure.O.toString())) {
                    overDiagonal_O++;
                    if (overDiagonal_O == WINNER_VALUE) {
                        ConsoleView.printWinner(Player.getPlayer2());
                        haveWinner = true;
                        break;
                    }
                }
            }
        }

        // Если нет победителя продолжаем
        if (!haveWinner) {
            CurrentMoveController.switchPlayers();
        }
    }
}
