package pl.wzorce.builder1;

public class FactoryMain {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        int z = 3;
        FactoryInterface obliczPole;
        switch (z) {
            case 1:
                obliczPole = new Square(a);
                break;
            case 2:
                obliczPole = new Circle(a);
                break;
            case 3:
                obliczPole = new Rectangle(a, b);
        }

    }
}
