package codeWars.kata7.potatoes;

public class Potatoes {

    public static void main(String[] args) {
        System.out.println(potatoes(99, 100, 98));
    }

    public static double potatoes(int p0, int w0, int p1) {

        double x = (99/98)/100;

        /**
         *      100 = x*99% + K
         *      50  = X*98% + K
         *
         *
         *      */

        return x;
    }
}
