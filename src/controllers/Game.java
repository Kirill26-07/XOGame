/** Класс реализует управление игровым процессом
 */

package controllers;
import model.Field;
import model.Figure;
import view.ConsoleView;

public class Game {

    ConsoleView consoleView = new ConsoleView();
    MoveController moveController = new MoveController();

    public void startGame(){

        consoleView.printGameName();
        consoleView.createPlayers();
        letsPlay();
    }

    private void letsPlay(){
        Field.fieldWithCoordinates();
        moveController.setFigureOnField(Figure.X.toString());


    }


}