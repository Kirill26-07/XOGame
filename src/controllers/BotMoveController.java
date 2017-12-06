package controllers;

import model.Field;
import model.Figure;
import java.util.Random;

// Класс генерирует координаты по которым устанавливается фигура
class BotMoveController extends MoveController {

    private Random RANDOM = new Random();
    private String[][] field = Field.getField();

    // Получаем координаты от компьютера
    @Override
    int[] getMoveCoordinates() {
        int[] result = getRandomPoint();
        while ((field[result[0]][result[1]].trim().equals(Figure.X.toString())) || (field[result[0]][result[1]].equals(Figure.O.toString()))){
            result = getRandomPoint();
        }
        return result;
    }

    private int[] getRandomPoint() {
        return new int[] {getRandomInt(), getRandomInt()};
    }

    private int getRandomInt() {
        return Math.abs(RANDOM.nextInt() % 3);
    }
}

//
//    @Override
//    int[] getMoveCoordinates() {
//
//        int[] botCoordinates = new int[2];
//
//        String[][] field = Field.getField();
//
//        if ((!(field[1][1].trim().equals(Figure.X.toString())) && (!(field[1][1].trim().equals(Figure.O.toString()))))) {
//            botCoordinates[0] = 1;
//            botCoordinates[1] = 1;
//            return botCoordinates;
//        }
//
//        if ((!(field[0][0].trim().equals(Figure.X.toString())) && (!(field[0][0].trim().equals(Figure.O.toString()))))) {
//            botCoordinates[0] = 0;
//            botCoordinates[1] = 0;
//            return botCoordinates;
//        }
//
//        if(field[0][0].trim().equals(Figure.X.toString()) && ((!(field[2][0].trim().equals(Figure.X.toString())) && (!(field[2][0].trim().equals(Figure.O.toString())))))){
//            botCoordinates[0] = 2;
//            botCoordinates[1] = 0;
//            return botCoordinates;
//        }
//
//        if((field[0][0].trim().equals(Figure.X.toString()) && field[2][0].trim().equals(Figure.X.toString())) && ((!(field[1][0].trim().equals(Figure.O.toString()))))){
//            botCoordinates[0] = 1;
//            botCoordinates[1] = 0;
//            return botCoordinates;
//        }
//        if((field[0][2].trim().equals(Figure.X.toString()) && field[1][2].trim().equals(Figure.X.toString())) && ((!(field[3][2].trim().equals(Figure.O.toString()))))){
//            botCoordinates[0] = 3;
//            botCoordinates[1] = 2;
//            return botCoordinates;
//        }
//
//        if((field[0][0].trim().equals(Figure.X.toString()) && field[0][2].trim().equals(Figure.X.toString())) && ((!(field[0][1].trim().equals(Figure.O.toString()))))){
//            botCoordinates[0] = 0;
//            botCoordinates[1] = 1;
//            return botCoordinates;
//        }
//
//        if((field[3][0].trim().equals(Figure.X.toString()) && field[3][2].trim().equals(Figure.X.toString())) && ((!(field[3][1].trim().equals(Figure.O.toString()))))){
//            botCoordinates[0] = 3;
//            botCoordinates[1] = 1;
//            return botCoordinates;
//        }
//
//        if ((!(field[0][2].trim().equals(Figure.X.toString())) && (!(field[0][2].trim().equals(Figure.O.toString()))))) {
//            botCoordinates[0] = 0;
//            botCoordinates[1] = 2;
//            return botCoordinates;
//        }
//
//       if ((!(field[2][0].trim().equals(Figure.X.toString())) && (!(field[2][0].trim().equals(Figure.O.toString()))))) {
//            botCoordinates[0] = 2;
//            botCoordinates[1] = 0;
//            return botCoordinates;
//        }
//
//
//       if ((!(field[2][2].trim().equals(Figure.X.toString())) && (!(field[2][2].trim().equals(Figure.O.toString()))))) {
//            botCoordinates[0] = 2;
//            botCoordinates[1] = 2;
//            return botCoordinates;
//        }
//
//       if (field[0][0].trim().equals(Figure.O.toString()) && ((!(field[2][2].trim().equals(Figure.X.toString())) && (!(field[2][2].trim().equals(Figure.O.toString())))))) {
//            botCoordinates[0] = 2;
//            botCoordinates[1] = 2;
//            return botCoordinates;
//        }
//
//       if (field[2][0].trim().equals(Figure.O.toString()) && ((!(field[0][2].trim().equals(Figure.X.toString())) && (!(field[0][2].trim().equals(Figure.O.toString())))))) {
//            botCoordinates[0] = 0;
//            botCoordinates[1] = 2;
//            return botCoordinates;
//        }
//
//        if ((!(field[2][2].trim().equals(Figure.X.toString())) && (!(field[2][2].trim().equals(Figure.O.toString()))))) {
//            botCoordinates[0] = 2;
//            botCoordinates[1] = 2;
//            return botCoordinates;
//        }
//
//        if ((!(field[1][2].trim().equals(Figure.X.toString())) && (!(field[1][2].trim().equals(Figure.O.toString()))))) {
//            botCoordinates[0] = 1;
//            botCoordinates[1] = 2;
//            return botCoordinates;
//        }
//
//        return botCoordinates;
