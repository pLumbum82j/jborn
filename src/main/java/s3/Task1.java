package s3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите название государства");
        String state = requestString();
        System.out.println("Введите столицу государства");
        String capital = requestString();
        System.out.println("Столица государства " +state+ " — город " + capital);

    }
    public static String requestString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
