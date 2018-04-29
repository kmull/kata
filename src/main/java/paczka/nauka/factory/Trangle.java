package paczka.nauka.factory;

public class Trangle implements Shape {

    Trangle(int a, int b, int c) {
        System.out.println("Trojtąt");
        obliczObwod(a, b, c);
        obliczPole(a, b);
    }

    @Override
    public void obliczPole(int a, int b) {
        System.out.println("pole: " + (a * b) / 2);
    }

    @Override
    public void obliczObwod(int a, int b) {
        System.out.println("not use");
    }

    @Override
    public void obliczObwod(int a, int b, int c) {
        System.out.println("obwod: " + (a + b + c));
    }

}
