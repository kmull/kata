package pl.kata.HighAndLow;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Kata {

    public static String HighAndLow(String numbers) {
        // Code here or
        IntSummaryStatistics summary = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .summaryStatistics();

        String some = "krzys";
        double ff = 3.3;
//        return summary.getMax() + " " + summary.getMin();
        return String.format("%d %d %s, %.2f", summary.getMax(), summary.getMin(), some, ff);
    }

    public static String HighAndLow2(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return max + " " + min;
    }

    public static String HighAndLow3(String numbers) {
        String[] str = numbers.split(" ");
        Integer[] ints = new Integer[str.length];

        for (int i = 0; i < str.length; i++) {
            ints[i] = Integer.parseInt(str[i]);
        }
        int min = ints[0];
        int max = ints[0];

        for (int i : ints) {
            if (max < i)
                max = i;
            if (min > i)
                min = i;
        }
        return max + " " + min;
    }


    public static void main(String[] args) {
        String a = HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println(a);

        String b = HighAndLow2("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println("\n" + b);

        String c = HighAndLow3("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println("\n" + c);

    }
}
