package model;


public class Player {

    private static String PLAYER_1;
    private static String PLAYER_2;

    public Player(String player_1, String player_2){
        PLAYER_1 = player_1;
        PLAYER_2 = player_2;
    }

    public String getPlayer1() {
        return PLAYER_1;
    }

    public String getPlayer2() {
        return PLAYER_2;
    }
}
