package s3;

import java.util.Scanner;

public class Task8 {

    /**
     * Инверсия строки. Из консоли вводится строка, реализовать ее инверсию. Не использовать метед reverse(). Например:
     * Строка: "Привет всем моим друзьям!"
     * Результат инверсии: "!мяьзурд миом месв тевирП"
     */

    public static void main(String[] args) {
        String str = requestStr();
        System.out.println("Вы ввели: " + str);

        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[str.length() - i - 1] = str.charAt(i);
        }
        String result = String.copyValueOf(chars);

        System.out.println("Результат инверсии: " + result);
    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        return scanner.nextLine();
    }
}
