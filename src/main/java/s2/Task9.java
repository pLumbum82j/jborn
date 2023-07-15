package s2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int result = 0;
        int x = requestNum();
        while (x != 0) {
            int temp = x % 10;
            x = (x - temp) / 10;
            result += temp;
        }
        System.out.println(result);
    }

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение:");
        return scanner.nextInt();
    }
}
