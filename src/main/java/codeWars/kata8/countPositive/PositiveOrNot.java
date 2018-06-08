package codeWars.kata8.countPositive;

import java.util.stream.IntStream;

public class PositiveOrNot {

    public static void main(String[] args) {
        for (int x : countPositivesSumNegatives(new int[]
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})) {
            System.out.print(x + " ");
        }
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int[] positive = new int[2];
        try {
            if (input.length == 0) {
                return new int[]{};
            }
            positive[0] = (int) IntStream.of(input)
                    .filter(x -> x > 0)
                    .count();

            positive[1] = IntStream.of(input)
                    .filter(x -> x < 0)
                    .sum();
        } catch (NullPointerException e) {
            return new int[]{};
        }
        return positive;
    }

    public static int[] countPositivesSumNegatives2(int[] input) {

        return input == null || input.length == 0 ?
                new int[]{} :
                new int[]{
                        (int) IntStream.of(input).filter(x -> x > 0).count(),
                        IntStream.of(input).filter(x -> x < 0).sum()
                };
    }
}
