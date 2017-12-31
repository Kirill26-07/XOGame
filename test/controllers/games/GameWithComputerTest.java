package controllers.games;

import controllers.CurrentMoveController;
import model.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameWithComputerTest {

    @Test
    void inputUsersName() {
        new GameWithComputer();
        new Player("Kirill");

    assertEquals("Kirill", Player.getPlayer1());


    }

    @Test
    void letsPlay() {
        new GameWithComputer();
        CurrentMoveController.setGameWithBoot(true);

     //   assertTrue(CurrentMoveController.gameWithBoot); // Перед тестом поменять модификатор доступа!!!!


    }
}