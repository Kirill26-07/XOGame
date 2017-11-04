package model;

public class Point {

    public String[][] createCoordinates(String[][] field){

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
