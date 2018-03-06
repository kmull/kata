package pl.kata.cubes;

public class Cubes {

    public static long findNb2(long m) {
        long total = 0;
        int counter = 0;

        while (total < m) {
            counter++;
            total = total + (long) Math.pow(counter, 3);
        }

        if (m == total)
            return counter;
        return -1;
    }

    public static long findNb(long m) {
        int counter = 0;
        long total = 0;

        while (total < m) {
            counter++;
            total += Math.pow(counter, 3);
        }
        if (total == m) {
            return counter;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNb(1071225));
    }
}
