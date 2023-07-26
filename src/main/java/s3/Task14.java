package s3;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {

    /**
     * !! НЕ РЕШЕНО !!
     * *** Из консоли вводится выражение: "d1 + d2 + d3 + d4 + d5" (может быть больше чем 5).
     * Найти результат вычисления данного выражения.
     * Например:
     * Введите выражение: 1 + 2 + 5 + 7 + 14
     * Равно: 29
     */

    public static void main(String[] args) {
        String str = "1 + 2 + 5 + 7 - 14";
        //String str = requestStr();
        System.out.println("Вы ввели: " + str);
        int result = 0;
        String[] strArr = str.split(" \\+ ");
        String plus = "+";
        String space = " ";
        System.out.println(Arrays.toString(strArr));
//        for (int i = 0; i < strArr.length; i++) {
//
//            if (plus != strArr) {
//                result += Integer.parseInt(Arrays.toString(strArr));
//            }
//        }
        System.out.println("Равно:" + result);
    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        return scanner.nextLine();
    }
}
