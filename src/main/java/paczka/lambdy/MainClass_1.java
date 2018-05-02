package paczka.lambdy;

import pl.lambdaTrenning.Lambda1;

public class MainClass_1 {

    public static void main(String[] args) {
//        int a = 2;
//        int b = 5;
        Lambda1Interface addInt = ((a, b) -> a + b);
        Lambda1Interface minus = ((a, b) -> a - b);
        Lambda1Interface times = ((a, b) -> a * b);
        Lambda1Interface divide = ((a, b) -> a / b);

        System.out.println("a+b = " + funkcja1(17, 6, addInt));
        System.out.println("a-b = " + funkcja1(17, 6, minus));
        System.out.println("a*b = " + funkcja1(17, 6, times));
        System.out.println("a/b = " + funkcja1(17, 6, divide));

    }

    private static Integer funkcja1(int a, int b, Lambda1Interface lambda1Interface) {
        return lambda1Interface.operation(a, b);
    }

}


