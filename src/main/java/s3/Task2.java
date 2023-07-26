package s3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    /**
     * Написать программу, которая выводит последовательность рандомных целых чисел (ПИН-код) по количеству регистров,
     * которые вводятся из консоли. Например, N=7 (N-вводится из консоли). Результат: 5412409.
     */

    public static void main(String[] args) {
        int n = requestNum();
        int min = 0;
        int max = 9;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < n; i++) {
            password.append(random.nextInt(max - min + 1) + min);
        }
        System.out.println("Ваш пароль: " + password);
    }

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N");
        return scanner.nextInt();
    }
}
