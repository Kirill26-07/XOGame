package controllers.bot;

import controllers.CurrentMoveController;
import controllers.MoveController;
import model.Field;
import model.Figure;
import java.util.Random;

// Класс генерирует координаты по которым устанавливается фигура
public class BotMoveController extends MoveController {

    private Random RANDOM = new Random();
    private String[][] field = Field.getField();

    // Получаем координаты от компьютера
    @Override
    protected int[] getMoveCoordinates() {
        int[] result = getRandomPoint();
        while ((field[result[0]][result[1]].trim().equals(Figure.X.toString())) || (field[result[0]][result[1]].equals(Figure.O.toString()))){
            result = getRandomPoint();
        }
        return result;
    }

    int[] getRandomPoint() {
        return new int[] {getRandomInt(), getRandomInt()};
    }

    private int getRandomInt() {
        return Math.abs(RANDOM.nextInt() % 3);
    }

    @Override
    protected void fieldIsBusy(){

        setFigureOnField(CurrentMoveController.getCurrentFigure());
    }

}
