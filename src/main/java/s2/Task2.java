package s2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n = requestNumber();
        System.out.println("полных часов прошло с начала суток: " + n / 60 / 60);
        System.out.println("полных минут прошло с начала очередного часа : " + (n / 60) % 60);
        System.out.println("полных секунд прошло с начала очередной минуты: " + n % 60);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
