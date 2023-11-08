package s6;

import static java.lang.Math.sqrt;

public class Triangle extends Rectangle {
    protected final int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Периметр треугольника = " + (a + b + c));
    }

    @Override
    void calculateArea() {
        double p;
        p = (double) (a + b + c) / 2;
        //при p-c получаем ноль, а умножение на ноль даёт ноль, надо подумать.
        System.out.println("Площадь треугольника = " + (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
    }
}
