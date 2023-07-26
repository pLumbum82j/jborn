package s3;

import java.util.Scanner;

public class Task5 {

    /**
     * Из консоли вводится строка. Определить является ли строка палиндромом (например: мадам, комок, ротор).
     */

    public static void main(String[] args) {
        String str = requestString();
        System.out.println("Вы ввели: " + str);
        OptionOne optionOne = new OptionOne();
        OptionTwo optionTwo = new OptionTwo();
        optionOne.go(str);
        optionTwo.go(str);
    }

    public static String requestString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        return scanner.next();
    }
}

class OptionOne {
    StringBuilder stringBuilder;

    public void go(String str) {
        stringBuilder = new StringBuilder(str).reverse();
        String result = String.valueOf(stringBuilder);
        System.out.println("Слово является палиндромом, Вариант №1: " + str.equals(result));
    }
}

class OptionTwo {
    int n;

    public void go(String str) {
        n = str.length();
        char[] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }

        String result = String.copyValueOf(temp);
        System.out.println("Слово является палиндромом, Вариант №2: " + str.equals(result));
    }


}
