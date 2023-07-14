package s2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double r = requestNum();
        double s = Math.PI * (r * r);
        System.out.println("Площадь круга ровна: " + s);
        double i = 2 * Math.PI * r;
        System.out.println("Длина окружности ровна: " + i);
    }

    public static double requestNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус");
        return scanner.nextDouble();
    }
}
