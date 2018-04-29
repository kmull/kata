package paczka.nauka.factory;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        choseShape();
    }

    public static void choseShape() {
        int a = 4, b = 6, c = 8;

        System.out.println("trojkat - t\n" +
                "kwadrat - k\n" +
                "prostokąt - p");

        switch (new Scanner(System.in).next()) {
            case "k":
                new Square(a, b);
                break;

            case "t":
                new Trangle(a, b, c);
                break;

            case "p":
                new Rectangle(a, b);
                break;
        }


    }

}
