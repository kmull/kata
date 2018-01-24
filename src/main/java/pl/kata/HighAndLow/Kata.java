package pl.kata.HighAndLow;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Kata {

    public static String HighAndLow(String numbers) {
        // Code here or

//        int min = Arrays.stream(numbers.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .min()
//                .getAsInt();
//
//        int max = Arrays.stream(numbers.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .max()
//                .getAsInt();
//
//        return max + " " + min;

        IntSummaryStatistics summary = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .summaryStatistics();

//        return summary.getMax() + " " + summary.getMin();
        String some = "krzys";
        double ff =  3.3;
        return String.format("%d %d %s, %.2f" , summary.getMax(), summary.getMin(), some, ff);
    }


    public static void main(String[] args) {
        String a = HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println(a);
    }
}
