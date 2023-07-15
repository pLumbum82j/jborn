package s2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        double n = requestNum();

        int x = 1; // При нулевой степени
        int j = 2;
        for (int i = 1; i <= n; i++) {
            x += j;
            j *= 2;
        }
        System.out.println("Ответ будет равен " + x);

        int y = 0;
        for (int i = 0; i <= n; i++) {
            y += 1 << i;
        }
        System.out.println("Ответ будет равен " + y);

        double proverka = Math.pow(2, 0) + Math.pow(2, 1) + Math.pow(2, 2) + Math.pow(2, 3)+ Math.pow(2, 4)+ Math.pow(2, 5);
        System.out.println("Ответ будет равен " + proverka);
    }

    // 2^0 = 1 = 1
    // 2^1 = 2 = 3
    // 2^2 = 4 = 7
    // 2^3 = 8 = 15
    // 2^4 = 16 = 31
    // 2^5 = 32 = 63

    public static int requestNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение N: ");
        return scanner.nextInt();
    }
}
