package s2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n = requestNumber();
        if (n < 10) {
            System.out.println("Вы ввели однозначное число");
        } else if (n > 100) {
            System.out.println("Вы ввели трёхзначное число");
        } else {
            int a = n / 10;
            System.out.println("число десятков в нем: " + a);
            int b = n % 10;
            System.out.println("число единиц в нем: " + b);
            int c = a + b;
            System.out.println("сумму его цифр: " + c);
            int d = a * b;
            System.out.println("произведение его цифр: " + d);
        }


    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
