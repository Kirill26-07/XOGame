package controllers;
import model.Figure;

class CurrentMoveController {

    private static String currentFigure = "X";

    static void switchPlayers(){

        if(currentFigure.equals(Figure.X.toString())){
            currentFigure = "O";
            MoveController.setFigureOnField(Figure.X.toString());
        }
        else{
            currentFigure = "X";
            MoveController.setFigureOnField(Figure.O.toString());
        }
    }
}
