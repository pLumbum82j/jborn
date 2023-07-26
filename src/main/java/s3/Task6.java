package s3;

import java.util.Scanner;

public class Task6 {

    /**
     * Из консоли вводится строка и символ. Определить сколько раз встречается данный символ и заменить в строке этот
     * символ на верхний регистра, например, str="java" и ch='a', то результат:
     * Кол-во вхождений: 2
     * Преобразованная строка: jAvA
     */

    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        String str = requsetStr();
        System.out.println("Введите какой символ хотите посчитать и заменить на верхний регистр: ");
        int num = Integer.parseInt(requsetStr());

        System.out.println("Вы ввели: " + str);
        System.out.println("Хотите посчитать символ: " + num);

         if (num > str.length() || num < 0) {
            System.out.println("Символ выходит за рамки слова");
        }

        char charValue = str.charAt(num - 1);
        StringBuilder result = new StringBuilder();
        int iterResult = 0;

        for (int i = 0; i < str.length(); i++) {
            if (charValue == str.charAt(i)) {
                result.append(str.toUpperCase().charAt(i));
                iterResult++;
            } else {
                result.append(str.charAt(i));
            }
        }

        System.out.println();
        System.out.println("Ваше итоговое слово будет выглядеть: " + result);
        System.out.println("Количество повторений символа " + charValue + " = " + iterResult);
    }

    public static String requsetStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
