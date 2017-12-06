package controllers.bot;

import controllers.MoveController;
import model.Field;
import model.Figure;

public class HardBotMoveController extends MoveController {


    @Override
    protected int[] getMoveCoordinates() {

        int[] botCoordinates = new int[2];

        String[][] field = Field.getField();

        if ((!(field[1][1].trim().equals(Figure.X.toString())) && (!(field[1][1].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 1;
            botCoordinates[1] = 1;
            return botCoordinates;
        }

        if ((!(field[0][0].trim().equals(Figure.X.toString())) && (!(field[0][0].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 0;
            botCoordinates[1] = 0;
            return botCoordinates;
        }

        if (field[0][0].trim().equals(Figure.X.toString()) && ((!(field[2][0].trim().equals(Figure.X.toString())) && (!(field[2][0].trim().equals(Figure.O.toString())))))) {
            botCoordinates[0] = 2;
            botCoordinates[1] = 0;
            return botCoordinates;
        }

        if ((field[0][0].trim().equals(Figure.X.toString()) && field[2][0].trim().equals(Figure.X.toString())) && ((!(field[1][0].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 1;
            botCoordinates[1] = 0;
            return botCoordinates;
        }
        if ((field[0][2].trim().equals(Figure.X.toString()) && field[1][2].trim().equals(Figure.X.toString())) && ((!(field[3][2].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 3;
            botCoordinates[1] = 2;
            return botCoordinates;
        }

        if ((field[0][0].trim().equals(Figure.X.toString()) && field[0][2].trim().equals(Figure.X.toString())) && ((!(field[0][1].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 0;
            botCoordinates[1] = 1;
            return botCoordinates;
        }

        if ((field[3][0].trim().equals(Figure.X.toString()) && field[3][2].trim().equals(Figure.X.toString())) && ((!(field[3][1].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 3;
            botCoordinates[1] = 1;
            return botCoordinates;
        }

        if ((!(field[0][2].trim().equals(Figure.X.toString())) && (!(field[0][2].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 0;
            botCoordinates[1] = 2;
            return botCoordinates;
        }

        if ((!(field[2][0].trim().equals(Figure.X.toString())) && (!(field[2][0].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 2;
            botCoordinates[1] = 0;
            return botCoordinates;
        }


        if ((!(field[2][2].trim().equals(Figure.X.toString())) && (!(field[2][2].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 2;
            botCoordinates[1] = 2;
            return botCoordinates;
        }

        if (field[0][0].trim().equals(Figure.O.toString()) && ((!(field[2][2].trim().equals(Figure.X.toString())) && (!(field[2][2].trim().equals(Figure.O.toString())))))) {
            botCoordinates[0] = 2;
            botCoordinates[1] = 2;
            return botCoordinates;
        }

        if (field[2][0].trim().equals(Figure.O.toString()) && ((!(field[0][2].trim().equals(Figure.X.toString())) && (!(field[0][2].trim().equals(Figure.O.toString())))))) {
            botCoordinates[0] = 0;
            botCoordinates[1] = 2;
            return botCoordinates;
        }

        if ((!(field[2][2].trim().equals(Figure.X.toString())) && (!(field[2][2].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 2;
            botCoordinates[1] = 2;
            return botCoordinates;
        }

        if ((!(field[1][2].trim().equals(Figure.X.toString())) && (!(field[1][2].trim().equals(Figure.O.toString()))))) {
            botCoordinates[0] = 1;
            botCoordinates[1] = 2;
            return botCoordinates;
        }

        return botCoordinates;

    }
}