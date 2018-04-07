package pl.kata.divisor;

public class Divisor {

    private static int numberOfDivisor(int n) {

        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDivisor(4));
    }
}
