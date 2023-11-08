package s5;

/**
 * Создать базовый класс Operation. Этот класс будет представлять любую алгебраическую операцию.
 * Он имеет следующие методы:
 * int calculate(int leftOperand, int rightOperand) - сама операция
 * и
 * int returnPrevious() - возвращает предыдущий вычисленный результат.
 * Поля определить самостоятельно.
 * Создать двух наследников Addition и Multiplication для представления операций сложения и умножения соответственно. Переопределить метод calculate, предоставив подходящую по смыслу реализацию.
 * В данной задаче имеет ли какой-нибудь смысл создавать экземпляры базового класса Operation?
 */
public class Task1 {
    public static void main(String[] args) {
        Operation operationOne = new Addition();
        // Операция сложения двух чисел
        operationOne.calculate(3, 3);
        System.out.println(operationOne.returnPrevious());

        Operation operationTwo = new Multiplication();
        // Операция умножения двух чисел
        operationTwo.calculate(3, 3);
        System.out.println(operationTwo.returnPrevious());
    }
}
