package pl.sumOfMultiply;

import java.util.stream.IntStream;

/**
 * sum of multiply 3, 5
 */
public class Solution {

    public static int solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                result += i;
            }
        }

        return result;
    }

    private static int solution2(int number) {

        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();

    }

    public static void main(String[] args) {

        System.out.println(solution(10));
        System.out.println(solution2(10));
        System.out.println(solution(15));

    }
}
