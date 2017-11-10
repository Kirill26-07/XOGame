/** Класс для заполнения созданого поля координатами: 00 01 02
*                                                     10 11 12
 *                                                    20 21 22
**/
package model;

public class Point {

    // Заполняем поле точками координат

    public String[][] createCoordinates(final String[][] field){

        int counter = 0;

        for(int i = 0; i < field.length; i ++){

            for(int j = 0; j < field.length; j++){

                field[i][j] = Integer.toString(counter);

                counter++;
            }
        }
        return field;
    }

}
