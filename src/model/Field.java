/**
 * Создает и хранит игровое поле с координатами и установленными фигурками
 */
package model;

public final class Field {

    // Создаем игровое поле
    private final String[][] field;

    public Field(String[][] newField) {
        if (newField[0][0] == null) {
            final PointBuilder pointBuilder = new PointBuilder();
            field = pointBuilder.createCoordinates(newField);
        } else {
            field = newField;
        }
    }

    // Отдаем поле с координатами
    public String[][] getField() {
        return field;
    }

    // Устанавливаем фигурку в указанную ячейку
    public void setField(final int i, final int j, final String figure) {
        field[i][j] = " " + figure;
    }

private class PointBuilder {
        // Заполняем поле точками координат
       private String[][] createCoordinates(final String[][] field) {
            for (int i = 0; i < field.length; i ++) {
                for (int j = 0; j < field.length; j++) {

                    field[i][j] = Integer.toString(i) + Integer.toString(j);
                }
            }
            return field;
        }
    }
}



