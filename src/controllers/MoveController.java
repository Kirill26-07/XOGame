/** Класс предназначен для установки фигуры в ячейку поля по координатам.
 *  Класс получает поле с координатами и фигуру того игрока, чей сейчас ход.
 *  Игрок выбирает свободное поле и устанавлиает туда свою фигуру, если поле пустое - фигура устанавливается,
 *  если поле занято - выводится сообщение и предлагается установить фигуру заново.
 *  После этого вызывается проверка победителя.
 **/
package controllers;

import controllers.reader.ConsoleReader;
import model.Board;
import model.Field;
import model.Figure;
import view.ConsoleView;

class MoveController {

    private static ConsoleReader consoleReader = new ConsoleReader();
    private static WinnerController winnerController = new WinnerController();
    private static Field field = new Field();

    private static int moveCounter = 0;

    // Принимает поле с координатами и устанавливает в свободную ячейку фигуру
    static void setFigureOnField(final String figure) {

        ConsoleView.currentPlayerStep(figure);                   // Выводит текущего игрока
        ConsoleView.needToCoordinates();                         // Сообщение о запросе координат от игрока

        char[] userInput = consoleReader.reader().toCharArray();

        int i = Character.getNumericValue(userInput[0]);
        int j = Character.getNumericValue(userInput[1]);


        if (MoveController.fieldFreeOrNot(i, j)) {                               // Проверка свободной ячейки
            field.setField(i, j, figure);
            Board.printBoard();
            winnerController.getWinner();
        } else {
            fieldIsBusy();
        }
    }

    // Проверяет свободна ли ячейка для установки фигуры
    private static boolean fieldFreeOrNot(final int i, final int j){

        String[][] controlField = Field.getField();

        if(!controlField[i][j].trim().equals(Figure.X.toString()) && !controlField[i][j].trim().equals(Figure.O.toString())){
            return true;
        }
        else{
            return false;
        }
    }

    // Если поле занято, вызываем заново метод setFigureOnField
    private static void fieldIsBusy(){

        ConsoleView.fieldBusy();
        setFigureOnField(CurrentMoveController.getCurrentFigure());
    }
}
