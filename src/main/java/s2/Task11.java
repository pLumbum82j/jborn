package s2;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 77;
        int[] month = new int[30];
        for (int i = 0; i < month.length; i++) {
            month[i] = random.nextInt(max - min + 1) + min;
            System.out.println(month[i]);
        }
        int maxPrecipitation = 0;
        int minPrecipitation = max;
        for (int x : month) {
            if (x > maxPrecipitation) {
                maxPrecipitation = x;
            }
            if (x < minPrecipitation) {
                minPrecipitation = x;
            }
        }
        for (int i = 0; i < month.length; i++) {
            int day = i - 1;
            if (maxPrecipitation == month[i]) {
                System.out.println("В " + day + " день было зафиксирован максимальное количество осадков имя значение: " + maxPrecipitation);
            }
            if (minPrecipitation == month[i]) {
                System.out.println("В " + day + " день было зафиксирован минимальное количество осадков имя значение: " + minPrecipitation);
            }
        }
    }
}
