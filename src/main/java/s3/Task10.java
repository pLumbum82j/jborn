package s3;

import java.util.Scanner;

public class Task10 {
    /**
     * Из консоли вводится предложение. Определить ошибся ли автор в написании "Жи/Ши пиши с буквой и".
     */

    public static void main(String[] args) {
        String str = requestStr();

    }

    public static String requestStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        return scanner.nextLine();
    }
}
