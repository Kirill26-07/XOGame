package model;

public class Field {

    private static String[][] field = new String[3][3];;


    private void fieldWithCoordinates(){
        Point point = new Point();

        field = point.createCoordinates(field);
    }

    public static String[][] getField() {
        return field;
    }
}