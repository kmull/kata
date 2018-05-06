package pl.wzorce.builder1;

public class Circle implements FactoryInterface {

    public Circle(int a) {
        System.out.println("Circle: " + pole(a, 0));
    }

    @Override
    public double pole(double a, double b) {
        return 3.14 * a;
    }
}

class Square implements FactoryInterface {

    public Square(int a) {
        System.out.println("Square: " + pole(a, 0));
    }

    @Override
    public double pole(double a, double b) {
        return a * a;
    }
}

class Rectangle implements FactoryInterface {

    public Rectangle(int a, int b) {
        System.out.println("Rectangle: " + pole(a, b));
    }

    @Override
    public double pole(double a, double b) {
        return a * b;
    }
}
