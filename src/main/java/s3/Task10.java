package s3;

import java.util.Scanner;

public class Task10 {

    /**
     * Из консоли вводится предложение. Определить ошибся ли автор в написании "Жи/Ши пиши с буквой и".
     */

    public static void main(String[] args) {
        // String str = requestStr().toLowerCase();
        String str = "Шимпанзе, шыло, шыть, Жизнь, жилище, живот, жевой, жираф, жыдкость, чижи, лыжи".toLowerCase();
        int iter = 0;

        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));
            if (temp.equals("ы") || temp.equals("е")) {
                temp = String.valueOf(str.charAt(i - 1));
                if (temp.equals("ж") || temp.equals("ш")) {
                    iter++;
                }
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
