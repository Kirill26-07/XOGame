/** Класс предназначен для вывода игровой информации на консоль игрокам
 */
package view;

public class ConsoleView implements IViewer {

    @Override
    public final void consolePrint(final String text) {
        System.out.println(text);
    }

    @Override
    public final void consolePrint(final StringBuilder stringBuilder) {
        System.out.println(stringBuilder);
    }
}