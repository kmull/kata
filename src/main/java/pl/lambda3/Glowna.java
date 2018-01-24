package pl.lambda3;

import java.util.Scanner;

public class Glowna extends Glowna2 {

    public Glowna(String name) {
        super(name);
    }
    @Override
    public String getName(){
        return name + " !";
    }
    public static void main(String[] args) {

        Glowna gl = new Glowna("Kasia");
        System.out.println(gl.getName());
        System.out.println();
//        fffffffffff
//        aaaaaaaaaaa
//        bbbbbbbbbbb

        Lambda3Interfejs addInt = ((a, b) -> a + b);
//        Lambda3Interfejs substract = ((a, b) -> a - b);
//        Lambda3Interfejs times = ((a, b) -> a * b);
//        Lambda3Interfejs divide = ((a, b) -> a / b);
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("dodaj: " + funkcja1(a, b, addInt));
//        System.out.println("odejmij: " + funkcja1(a, b, substract));
//        System.out.println("pomnoz: " + funkcja1(a, b, times));
//        System.out.println("podziel " + funkcja1(a, b, divide));

    }

    private static Integer funkcja1(int a, int b, Lambda3Interfejs lambda3Interfejs) {
        return lambda3Interfejs.operation(a, b);
    }
}
