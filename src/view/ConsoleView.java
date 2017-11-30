/** Класс предназначен для вывода игровой информации на консоль игрокам
 */
package view;

public class ConsoleView implements IViewer{

    @Override
    public void consoleViewer(String text) {

        System.out.println(text);

    }

    @Override
    public void printStringBuilder(StringBuilder stringBuilder) {

        System.out.println(stringBuilder);

    }
}