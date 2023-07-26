package s3;

import java.util.Scanner;

public class Task15 {

    /**
     * Из консоли вводится строка. Найти наибольшее количество идущих подряд одинаковых символов.
     * Например.
     * Введите строку: "Пррривет всееем моиииим друзьям!"
     * Результат:
     * Символ: "и"
     * Повторяется (раз): 4
     * Начиная с символа под номером: 19
     */
    public static void main(String[] args) {
        String str = requestStr();
        //String str = "Пррривет всееем моиииим друзьям!";
        System.out.println("Вы ввели: " + str);
        String stringIter = null;
        String saveChart = null;
        int iter = 0;
        int save = 0;
        int indexPosition = 0;

        for (int i = 0; i < str.length(); i++) {
            String charIndex = String.valueOf(str.charAt(i));
            if (!charIndex.equals(stringIter)) {
                stringIter = charIndex;
                iter = 1;
            } else {
                iter++;
                if (iter > save) {
                    save = iter;
                    saveChart = stringIter;
                    indexPosition = i;
                }

            }
        }
        System.out.println("Символ: " + saveChart);
        System.out.println("Повторяется(раз): " + save);
        System.out.println("Начиная с символа под номером: " + (++indexPosition - --save));

    }

    public static String requestStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        return scanner.nextLine();
    }
}
