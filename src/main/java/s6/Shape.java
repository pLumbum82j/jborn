package s6;

public abstract class Shape {
    protected final int a;

    public Shape(int a) {
        this.a = a;
    }

    // вычисляющим периметр фигуры
    abstract void calculatePerimeter();

    //вычисляющим площадь фигуры.
    abstract void calculateArea();

}
