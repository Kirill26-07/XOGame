/** Класс предназначен для установки фигуры в ячейку поля по координатам.
 *  Класс получает поле с координатами и фигуру того игрока, чей сейчас ход.
 *  Игрок выбирает свободное поле и устанавлиает туда свою фигуру, если поле пустое - фигура устанавливается,
 *  если поле занято - выводится сообщение и предлагается установить фигуру заново.
 *  После этого вызывается проверка победителя.
 **/

package controllers;
import model.Field;
import model.Figure;
import view.ConsoleView;

import java.util.Scanner;

public class MoveController {

    private static Scanner scanner = new Scanner(System.in);
    private static WinnerController winnerController = new WinnerController();
    private static Field field = new Field();

    // Принимает поле с координатами и устанавливает в свободную ячейку фигуру

    public static void setFigureOnField(final String figure){

        ConsoleView.currentPlayerStep(figure);
        ConsoleView.needToCoordinates();

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        if(fieldFreeOrNot(field, i, j)){
            field.setField(i, j, figure);
        }
        else {
            ConsoleView.fieldBusye();
        }

        winnerController.getWinner();
    }


    // Проверяет свободна ли ячейка для установки фигуры

    private static boolean fieldFreeOrNot(Field field, int i, int j){
        String[][] controlField = field.getField();

        if(controlField[i][j] != Figure.X.toString() || controlField[i][j] != Figure.O.toString()) {
            return true;
        }
        else {
            return false;
        }
    }
}
