package s2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Введите значение X");
        int x = requestNum();
        System.out.println("Введите значение Y");
        int y = requestNum();

        int test = x * y;
        int result;
        int temp = 0;

        while (y != 0) {
            temp += x;
            y--;
        }
        result = temp;
        System.out.println("Ответ: " + result);
        System.out.println("Проверка: " + test);

    }

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
