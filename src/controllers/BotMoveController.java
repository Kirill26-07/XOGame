package controllers;

// Класс генерирует координаты по которым устанавливается фигура
class BotMoveController extends MoveController {

    private static int[] botCoordinates = new int[2];

    // Получаем координаты от компьютера
    @Override
    int[] getMoveCoordinates() {

        botCoordinates[0] = (int) (Math.random() * 2);
        botCoordinates[1] = (int) (Math.random() * 2);

        return botCoordinates;
    }

    @Override
    protected void fieldIsBusy() {
        setFigureOnField(CurrentMoveController.getCurrentFigure());
    }
}
