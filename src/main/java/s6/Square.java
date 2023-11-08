package s6;

public class Square extends Shape {

    public Square(int a) {
        super(a);
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Периметр квадрата = " + (a * 4));
    }

    @Override
    void calculateArea() {
        System.out.println("Площадь квадрата = " + (a * 2));
    }

}
