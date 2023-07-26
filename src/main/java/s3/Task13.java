package s3;

import java.util.Objects;
import java.util.Scanner;

public class Task13 {

    /**
     * Из консоли вводится строка, содержащая слова разделённые последовательностями пробелов.
     * Необходимо убрать все лишние пробелы и вернуть изменённую строку.
     * Например.
     * Строка: "            Future              with              java          "
     * результатом будет: "Future with java"
     */
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String str = requestStr();
        //String str = "            Future              with              java          ";
        System.out.println("Вы ввели");
        System.out.println(" > " + str + " < ");
        String[] split = str.trim().split("");
        String s = " ";

        for (int i = 0; i < split.length; i++) {
            if (!Objects.equals(split[i], s)) {
                result.append(split[i]);
            } else if (Objects.equals(split[i], s) && !Objects.equals(split[i + 1], s)) {
                result.append(split[i]);
            }

        }
        System.out.println("Результатом будет: " + result);
    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        return scanner.nextLine();
    }
}
