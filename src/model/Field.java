/**
 * Создает и хранит игровое поле с координатами и установленными фигурками
 */
package model;

public final class Field {

    // Создаем игровое поле
    private static String[][] field = new String[3][3];

    // Добовляем координаты
    public void fieldWithCoordinates(){
        final PointBuilder pointBuilder = new PointBuilder();
        field = pointBuilder.createCoordinates(field);

    }

    // Отдаем поле с координатами
    public static String[][] getField() {
        return field;
    }

    // Устанавливаем фигурку в указанную ячейку
    public void setField(final int i, final int j, final String figure){
        field[i][j] = " " + figure;
    }

private class PointBuilder {

        // Заполняем поле точками координат
       private String[][] createCoordinates(final String[][] field){
            for(int i = 0; i < field.length; i ++){
                for(int j = 0; j < field.length; j++){

                    field[i][j] = Integer.toString(i) + Integer.toString(j);
                }
            }
            return field;
        }
    }
}



