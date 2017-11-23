package controllers.reader;
import java.util.Scanner;

public class ConsoleReader implements IReader{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String reader() {

        return scanner.nextLine();
    }
}