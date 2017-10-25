package view;
import controllers.Game;

public class AdvConsoleViev extends ConsoleView {

    public AdvConsoleViev(final Game game) {
        super(game);
    }

    @Override
    public void showGameName(){
        System.out.println("***\n" + game.getGameName() + "\n***");

    }

}
