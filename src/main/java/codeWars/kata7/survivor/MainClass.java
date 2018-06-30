package codeWars.kata7.survivor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("llllllllll");
        System.out.println("result: " + josephusSurvivor(7, 3));
    }

    public static int josephusSurvivor(final int n, final int k) {
        int tempN = n;
        List<Integer> list = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toList());
        int counttemp = 1;
        int count = 1;
        while (true) {
            if (tempN == 1) {
                System.out.println("count: " + count);
                return list.get(0);
                count--;
            }
            if (counttemp%3 == 0) {
                System.out.println("count: " + count);
                list.remove(count - 1);
                tempN--;
            }
            if (count >= tempN) {
                System.out.println("count: " + count);
                count = 1;
            }
            count++;

        }

    }
}
