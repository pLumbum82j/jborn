package s2;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 10;
        int[] arr = new int[random.nextInt(max - min + 1) + min];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }

        System.out.println("Размер массива имеет значение: " + arr.length);
        System.out.print("Значения массива: ");
        for (int result : arr) {
            System.out.print(result + " ");
        }

        double resultAverage = arr[0];

        for (int i = 1; i < arr.length; i++) {
            resultAverage += arr[i];
        }
        resultAverage /= arr.length;
        System.out.println();
        System.out.println("Среднее арифметическое значений из массива равно: " + resultAverage);
    }
}
