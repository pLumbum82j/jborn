package s3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String str = requestString();
        OptionOne optionOne = new OptionOne();
        optionOne.go(str);
    }
    public static String requestString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        return scanner.next();
    }
}
class OptionOne{
    StringBuilder stringBuilder;
    public void go(String str){
        stringBuilder = new StringBuilder(str).reverse();
        System.out.println("Вы ввели: " + stringBuilder);
        System.out.println(str.equals(stringBuilder));
    }
}
