package s2;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        OptionOne optionOne = new OptionOne();
        OptionTwo optionTwo = new OptionTwo();

        Random random = new Random();
        int min = 0;
        int max = 77;
        int[] month = new int[30];
        for (int i = 0; i < month.length; i++) {
            month[i] = random.nextInt(max - min + 1) + min;
            System.out.println("день " + (i + 1) + ". Осадков " + month[i]);
        }
        System.out.println("Вариант решения №1");
        optionOne.go(max, month);
        System.out.println("Вариант решения №2");
        optionTwo.go(month);
    }
}

class OptionOne {

    public void go(int max, int[] month) {

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
            int day = i + 1;
            if (maxPrecipitation == month[i]) {
                System.out.println("В " + day + " день было зафиксирован максимальное количество осадков имя значение: "
                        + maxPrecipitation);
            }
            if (minPrecipitation == month[i]) {
                System.out.println("В " + day + " день было зафиксирован минимальное количество осадков имя значение: "
                        + minPrecipitation);
            }
        }
    }
}

class OptionTwo {
    public void go(int[] month) {
        int maxPrecipitation = month[0];
        int minPrecipitation = month[0];
        for (int i = 1; i < month.length; i++) {
            if (maxPrecipitation < month[i]) {
                maxPrecipitation = month[i];
            }
            if (minPrecipitation > month[i])
                minPrecipitation = month[i];
        }
        for (int i = 0; i < month.length; i++) {
            int day = i + 1;
            if (maxPrecipitation == month[i]) {
                System.out.println("В " + day + " день было зафиксирован максимальное количество осадков имя значение: "
                        + maxPrecipitation);
            }
            if (minPrecipitation == month[i]) {
                System.out.println("В " + day + " день было зафиксирован минимальное количество осадков имя значение: "
                        + minPrecipitation);
            }
        }
    }
}