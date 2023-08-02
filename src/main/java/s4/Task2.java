package s4;

public class Task2 {

    /**
     * !НЕ ГТТОВО
     * Узнать про числа Фибоначчи
     * Какие недостатки имеет рекурсивно вычислить n-ое число Фибоначчи в лоб? Как можно улучшить алгоритм?
     */

    public static void main(String[] args) {
        //Fibonacci 0 1 1 2 3 5 8 13 21 34 55 89

        System.out.println(fib(4));
    }

    static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
