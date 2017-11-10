package model;


public class Field {

    // Создаем игровое поле

    private static String[][] field = new String[3][3];;

    // Добовляем координаты

    public static void fieldWithCoordinates(){
        Point point = new Point();
        field = point.createCoordinates(field);
    }

    // Отдаем поле с координатами

    public static String[][] getField() {
        return field;
    }

    public void setField(final int i, final int j, final String figure){
        field[i][j] = figure;
    }
}