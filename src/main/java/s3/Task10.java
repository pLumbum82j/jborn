package s3;

import java.util.Scanner;

public class Task10 {
    /**
     * !! НЕ ГОТОВО !!
     * Из консоли вводится предложение. Определить ошибся ли автор в написании "Жи/Ши пиши с буквой и".
     */

    public static void main(String[] args) {
        String str = requestStr().toLowerCase();
        int iter = 0;
        String lastCharIndex = String.valueOf(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            String charIndex = String.valueOf(str.charAt(i));
            if (lastCharIndex.equals("ж") || lastCharIndex.equals("ш")) {
                if (charIndex.equals("ы")) {
                    iter++;
                }
            } else {
                lastCharIndex = String.valueOf(str.charAt(i - 1));
            }
        }
        System.out.println("Пользователь ошибся: " + iter + " раз.");

    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        return scanner.nextLine();
    }
}
