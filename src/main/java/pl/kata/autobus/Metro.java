package pl.kata.autobus;

import java.util.ArrayList;
import java.util.List;

public class Metro {

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add((new int[]{3, 5}));
        list.add(new int[]{2, 5});

        System.out.println(countPassengers2(list));
    }

    public static int countPassengers(List<int[]> stops) {
        int count = 0;
        for (int[] a : stops) {
            count += a[0] - a[1];
        }
        return count;
    }

    public static int countPassengers2(List<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}
