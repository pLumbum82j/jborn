package s3;

import java.util.Scanner;

public class Task7 {

    /**
     * Из консоли вводится строка, содержащая символы верхнего и нижнего регистра.
     * Символы верхнего регистра заменить на нижний и наоборот. Например:
     * Строка: jBoRn
     * Результат инверсии: JbOrN
     */

    public static void main(String[] args) {
        String str = requestStr();
        System.out.println("Вы ввели: " + str);

        String tempStr = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tempStr.charAt(i)){
                stringBuilder.append(str.toUpperCase().charAt(i));
            } else {
                stringBuilder.append(str.toLowerCase().charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        return scanner.next();
    }
}
