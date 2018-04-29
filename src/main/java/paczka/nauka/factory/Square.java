package paczka.nauka.factory;

public class Square implements Shape {

    Square(int a, int b) {
        obliczObwod(a, a);
        obliczPole(a, a);
    }

    @Override
    public void obliczPole(int a, int b) {
        System.out.println("pole: " + (a * b));
    }

    @Override
    public void obliczObwod(int a, int b) {
        System.out.println("obwod: " + (4 * a));
    }

    @Override
    public void obliczObwod(int a, int b, int c) {
        System.out.println("not use");
    }
}
