package paczka.listyITablice;

public class FibISilnia {

    public static void main(String[] args) {
        System.out.println("fib: " + fib(6));
        System.out.println("silnia: " + silnia(4));
    }

    private static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    private static int silnia(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * silnia(n-1);
        }
    }
}
