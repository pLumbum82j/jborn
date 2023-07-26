package s3;

import java.util.Scanner;

public class Task4 {

    /**
     * Нарисовать в консоли прямоугольник с 2-мя заданными сторонами. Стороны (целые числа) запрашиваются из консоли A и B.
     * Например A=10 и B=5, то вывести:
     *       **********
     *       *        *
     *       *        *
     *       *        *
     *       **********
     */

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.out.println("Введите число A");
        int a = requestNum();
        System.out.println("Введите число B");
        int b = requestNum();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i >= 1 && j >= 1 && j != a - 1 && i != b - 1) {
                    str.append(' ');
                } else {
                    str.append('*');
                }
            }
            str.append('\n');
        }
        System.out.println(str);
    }

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
