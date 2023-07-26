package s3;

import java.util.Scanner;
import java.util.stream.IntStream;

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
        System.out.println("Введите разделитель: ");
        String charsStr =  requestStr();
        //char chars = charsStr.charAt(charsStr.length()-1);
        System.out.println("Вы ввели: " + str);
        String[] strTemp = str.split("\\*");

        System.out.println("Результат:");
        for (int i = 0; i < strTemp.length; i++) {
            System.out.println(strTemp[i] + " - " + strTemp[i].length());
        }

    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
