package s6;

/**
 * Абстрактный класс. Написать абстрактный класс Shape, описывающий абстрактную геометрическую фигуру,
 * с методами calculatePerimeter(), вычисляющим периметр фигуры, и calculateArea(), вычисляющим площадь фигуры.
 * Реализовать три конкретных наследника: Square (квадрат), Rectangle (прямоугольник), Triangle (треугольник).
 * Обратить внимание на наследование классов.
 */
public class Task1 {
    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape rectangle = new Rectangle(3, 4);
        Shape triangle = new Triangle(2, 4, 6);

        square.calculatePerimeter();
        square.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        triangle.calculatePerimeter();
        triangle.calculateArea();
    }
}
