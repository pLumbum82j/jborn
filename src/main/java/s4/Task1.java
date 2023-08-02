package s4;

public class Task1 {

    /**
     * 1. Написать рекурсивный метод, который бы инвертировал строку.
     * Инвертировать строку - переставить символы исходной строки в обратном порядке, например, для строки “jborn”,
     * инверсия будет “nrobj”.
     * Восхититесь изящностью решения.
     */
    public static void main(String[] args) {
        String str = "jborn";
        int n = str.length();
        recuesive(str, --n);
    }


    public static void recuesive(String str, int n) {
        if (n != -1) {
            System.out.print(str.charAt(n));
            n--;
            recuesive(str, n);
        }
    }
}
