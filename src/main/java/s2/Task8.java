package s2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int x = requestNum();
        System.out.println("Результат решения таблицы умножения на введённое вами число: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = "+ (i * x));
        }
    }

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение");
        return scanner.nextInt();
    }
}
