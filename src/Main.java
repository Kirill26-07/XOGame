import controllers.Game;
import view.AdvConsoleViev;
import view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        AdvConsoleViev advConsoleViev = new AdvConsoleViev(game);
        ConsoleView consoleViev = new ConsoleView(game);
        startGame(advConsoleViev);
    }

    private static void startGame(ConsoleView advConsoleViev){
        advConsoleViev.showGameName();
    }
}
