package codeWars.kata8.negative;

import static java.lang.Math.abs;

public class Negative {
    public static void main(String[] args) {

    }

    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }
    public static int makeNegative2(final int x) {
        return -abs(x);
    }
}
