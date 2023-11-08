package s6;

public class Rectangle extends Square {
    protected final int b;

    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Периметр прямоугольника = " + ((a * 2) + (b * 2)));
    }

    @Override
    void calculateArea() {
        System.out.println("Площадь прямоугольника = " + (a * b));
    }
}
