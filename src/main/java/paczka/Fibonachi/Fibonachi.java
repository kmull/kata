package paczka.Fibonachi;

public class Fibonachi {

    public static void main(String[] args) {

        int n = 0;
        for(int i=0; i<10; i++){
            System.out.println("Fibonacci " + i + " element: " + fib(i));
            System.out.println("Silnia " + i + " element: " + silnia(i));
            System.out.println();
        }
//        System.out.println("Fibonacci " + n + " element: " + fib(n));
//        System.out.println("Silnia " + n + " element: " + silnia(n));
    }

    public static long fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static long silnia(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 2) {
            return n;
        }
        return n * silnia(n - 1);
    }

}
