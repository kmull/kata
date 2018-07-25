package codeFight.almostIncreasingSequence;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MainClass {
    static int x;

    public static void main(String[] args) {
//        System.out.println(almostIncreasingSequence(new int[]{1, 3, 2, 1}));
//        System.out.println(almostIncreasingSequence(new int[]{1, 3, 2}));
        System.out.println(almostIncreasingSequence(new int[]{1, 2, 1, 2}));
//        System.out.println(almostIncreasingSequence(new int[]{1, 4, 10, 4, 2}));
//        System.out.println(almostIncreasingSequence(new int[]{10, 1, 2, 3, 4, 5}));
        System.out.println(almostIncreasingSequence(new int[]{1, 1, 1, 2, 3}));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
//        return IntStream
//                .range(0, sequence.length - 1)
//                .filter(i -> sequence[i] - sequence[i + 1] >= 0)
//                .sum()
//                +
//                IntStream
//                        .range(0, sequence.length - 2)
//                        .filter(i -> sequence[i] - sequence[i + 2] >= 0)
//                        .sum() < 2;

        int result = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i + 1] >= 0) {
                result++;
            }
        }
        return result < 2;
    }
/**  ten dziala  **/
    static boolean almostIncreasingSequence2(int[] sequence) {
        int check = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                check++;
            }
        }
        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] >= sequence[i + 2]) {
                check++;
            }
        }
        return check <= 2;
    }

    static boolean almostIncreasingSequence3(int[] a) {
        int cnt = 0, cnt2 = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) cnt++;
        }
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] >= a[i + 2]) cnt2++;
        }
        return cnt + cnt2 > 2 ? false : true;
    }
}
