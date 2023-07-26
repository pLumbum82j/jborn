package s3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task12 {

    /**
     * Из консоли вводится строка и символ. Строка разбивается разделителями (символ) на подстроки.
     * Вывести на экран все подстроки с указанием их длины. Например:
     * Строка: JBorn*Course*JaVa
     * Символ: *
     * Результат:
     * JBorn - 5
     * Course - 6
     * JaVa - 4
     */

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String str = requestStr();
        //String str = "JBorn*Course*JaVa";
        System.out.println("Введите разделитель: ");
        String charsStr = Pattern.quote(requestStr());
        char chars = charsStr.charAt(charsStr.length() - 1);
        System.out.println("Вы ввели: " + str);
        System.out.println(chars);
        String[] strTemp = str.split(charsStr);

        System.out.println("Результат:");
        for (String s : strTemp) {
            System.out.println(s + " - " + s.length());
        }
    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
