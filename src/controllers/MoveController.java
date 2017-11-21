/** Класс предназначен для установки фигуры в ячейку поля по координатам.
 *  Класс получает поле с координатами и фигуру того игрока, чей сейчас ход.
 *  Игрок выбирает свободное поле и устанавлиает туда свою фигуру, если поле пустое - фигура устанавливается,
 *  если поле занято - выводится сообщение и предлагается установить фигуру заново.
 *  После этого вызывается проверка победителя.
 **/
package controllers;

import model.Board;
import model.Field;
import model.Figure;
import view.ConsoleView;
import java.util.Scanner;

class MoveController {

    private static Scanner scanner = new Scanner(System.in);
    private static WinnerController winnerController = new WinnerController();
    private static Field field = new Field();

    // Принимает поле с координатами и устанавливает в свободную ячейку фигуру
    static void setFigureOnField(final String figure) {

        ConsoleView.currentPlayerStep(figure);                   // Выводит текущего игрока
        ConsoleView.needToCoordinates();                         // Сообщение о запросе координат от игрока

        char[] userInput = scanner.nextLine().toCharArray();

        int i = Character.getNumericValue(userInput[0]);
        int j = Character.getNumericValue(userInput[1]);


        if(fieldFreeOrNot(i, j)){                               // Проверка свободной ячейки
            field.setField(i, j, figure);
            Board.printBoard();
        }
        else{
            ConsoleView.fieldBusye();
        }

        winnerController.getWinner();                           // Проверка наличая победителя
    }

    // Проверяет свободна ли ячейка для установки фигуры
    private static boolean fieldFreeOrNot(int i, int j){

        String[][] controlField = Field.getField();

        System.out.println(controlField[i][j]);

        if(!controlField[i][j].trim().equals(Figure.X.toString()) && !controlField[i][j].trim().equals(Figure.O.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
