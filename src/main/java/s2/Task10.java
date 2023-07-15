package s2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        int arrSize = requestNum();
        int[] arr = new int[arrSize];
        int iterator = arrSize - 1;
        while (iterator != -1) {
            System.out.println("Введите значение в ячейку [" + iterator + "]");
            arr[iterator] = requestNum();
            iterator--;
        }
        int resultSum = 0;
        int resultMul = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                resultSum += arr[i];
            } else {
                resultMul *= arr[i];
            }
        }
        System.out.println("Сумма всех чётных элементов массива равна: " + resultSum);
        System.out.println("Произведение всех нечётны элементов массива равна: " + resultMul);
    }

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
