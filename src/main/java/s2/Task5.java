package s2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int a = requestNum();
        System.out.println("Введите второе число: ");
        int b = requestNum();
        System.out.println("Введите третье число: ");
        int c = requestNum();

        if ((a * a) + (b * b) == (c * c) || (b * b) + (c * c) == (a * a) || (a * a) + (c * c) == (b * b)) {
            System.out.println("У вас получилась Пифагорова тройка");
        } else {
            System.out.println("У вас не Пифагорова тройка");
        }

    }

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
