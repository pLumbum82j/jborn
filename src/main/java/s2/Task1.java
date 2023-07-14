package s2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int s = requestNumber();
        System.out.println(s / 100);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}

