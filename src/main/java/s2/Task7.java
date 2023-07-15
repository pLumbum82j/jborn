package s2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите значение Х");
        double x = requestNum();
        if (x > 0) {
            double sin = Math.sin(x);
             double result = sin * sin * x;
           // double result = (Math.pow(sin, 2)) * x;
            System.out.println(result);
        } else {
            double sin = Math.sin(x);
            double result = 1 - 2 * sin * x * x;
            System.out.println(result);
        }

    }

    public static double requestNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
