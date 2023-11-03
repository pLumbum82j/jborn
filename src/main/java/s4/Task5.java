package s4;

import java.util.Scanner;

/**
 * НЕ ГОТОВ!!
 * Создать перечисление (Enum), описывающее латинский алфавит с методом, который бы возвращал номер буквы в алфавите.
 */
public class Task5 {
    public static void main(String[] args) {
        String serchChar = requestSymbol();
        String lowerSymbol = serchChar.toLowerCase();
        System.out.println("Букве: \"" +  serchChar + "\" латинского алфавита соответсвует порядковый номер: "
                + (Task5Enum.valueOf(lowerSymbol).ordinal() + 1));
    }

    public static String requestSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву латинского алфавита");
        return scanner.next();
    }
}
