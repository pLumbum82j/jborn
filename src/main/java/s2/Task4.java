package s2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите Х1");
        double xOne = requestNumber();
        System.out.println("Введите Y1");
        double yOne = requestNumber();
        System.out.println("Введите Х2");
        double xTwo = requestNumber();
        System.out.println("Введите Y2");
        double yTwo = requestNumber();
        double result =  Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
        System.out.println("расстояния между ними: " + result);

    }

    static double requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
