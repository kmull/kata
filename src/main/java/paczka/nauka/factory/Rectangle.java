package paczka.nauka.factory;

public class Rectangle implements Shape {

    public Rectangle(int a, int b) {
        obliczObwod(a, b);
        obliczPole(a, b);
    }

    @Override
    public void obliczPole(int a, int b) {
        System.out.println("pole: " + (a * b));
    }

    @Override
    public void obliczObwod(int a, int b) {
        System.out.println("obwod: " + (2 * a + 2 * b));
    }

    @Override
    public void obliczObwod(int a, int b, int c) {
        System.out.println("not use");
    }
}
