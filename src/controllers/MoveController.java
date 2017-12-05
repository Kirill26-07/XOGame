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

public class MoveController {

    private static ConsoleReader consoleReader = new ConsoleReader();
    private static WinnerController winnerController = new WinnerController();
    private static Field field = new Field();
    private static ConsoleView consoleView = new ConsoleView();

    private static int moveCounter = 0;

    // Принимает поле с координатами и устанавливает в свободную ячейку фигуру
    public void setFigureOnField(final String figure) {

        // Выводит текущего игрока
        consoleView.consoleViewer("Step for player with " + figure + " figure!");

        int[] coordinates = getMoveCoordinates();

        // Проверка свободной ячейки
        if (fieldFreeOrNot(coordinates[0], coordinates[1])) {
            field.setField(coordinates[0], coordinates[1], figure);
            Board.printBoard();
                if(moveCounter < 4){
                    moveCounter++;
                    CurrentMoveController.switchPlayers();
                }else {
                    winnerController.getWinner();
                }
        } else {
            fieldIsBusy();
        }
    }

    // Проверяет свободна ли ячейка для установки фигуры
    private boolean fieldFreeOrNot(final int i, final int j){

        String[][] controlField = Field.getField();

        if(!controlField[i][j].trim().equals(Figure.X.toString()) && !controlField[i][j].trim().equals(Figure.O.toString())){
            return true;
        }
        else{
            return false;
        }
    }

    // Если поле занято, вызываем заново метод setFigureOnField
    void fieldIsBusy(){

        consoleView.consoleViewer("Field with this coordinate was busy, please, set you figure in the other field!");
        setFigureOnField(CurrentMoveController.getCurrentFigure());
    }

    // Получаем координаты
    int[] getMoveCoordinates(){

        // Сообщение о запросе координат от игрока
        consoleView.consoleViewer("Please, input field coordinate, where would you like to set the figure: ");

        char[] userInput = consoleReader.reader().toCharArray();

        int[] coordinates = new int[2];
        coordinates[0] = Character.getNumericValue(userInput[0]);
        coordinates[1] = Character.getNumericValue(userInput[1]);

        return coordinates;
    }
}
