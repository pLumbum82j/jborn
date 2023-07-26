package s3;

import java.util.Scanner;

public class Task9 {

    /**
     * Из консоли вводится массив строк (вспомним как в первом занятии вводили массивы, сначала размер, потом по элементу),
     * вывести все введенные строки через запятую. Учесть что на краях новой строки не должно быть запятых. Например:
     * Введите кол-во строк: 3
     * Строка 0: красный
     * Строка 1: синий
     * Строка 2: жельтый
     * Результат: красный, синий, жельтый
     */

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        System.out.println("Введите количество строк: ");
        int numStr = Integer.parseInt(requestStr());

        String[] strArr = new String[numStr];

        for (int i = 0; i < numStr; i++) {
            System.out.println("Введите строку которая попадёт в ячейку: " + i);
            strArr[i] = requestStr();
        }

        for (int i = 0; i < numStr; i++) {
            if (i != numStr - 1) {
                result.append(strArr[i])
                        .append(", ");
            } else {
                result.append(strArr[i]);
            }
        }
        System.out.println("Результат: " + result);
    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
