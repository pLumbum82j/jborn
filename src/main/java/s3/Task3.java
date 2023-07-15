package s3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String str = requestString();
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            resultString.append(String.valueOf(str.charAt(i)).repeat(j)) ;
            resultString.append('\n');
        }
        System.out.println(resultString);
    }

    public static String requestString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        return scanner.next();
    }
}
