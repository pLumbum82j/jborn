package s7;

/**
 * Написать метод, которые сравнивает 2 любых числа и возвращает положительное число  - если первое число больше второго,
 * 0 - если числа равны, отрицательное число - если первое число меньше второго
 */
public class Task3 {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 3;
        Compare compare = new Compare();
        System.out.println(compare.compare(a, b));

    }
}
