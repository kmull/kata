package codeFight.shapeArea;

import java.util.stream.IntStream;

public class Shape {
    public static void main(String[] args) {

        System.out.println(shapeArea(1));
        System.out.println(shapeArea(2));
        System.out.println(shapeArea(3));
        System.out.println(shapeArea(4));
        System.out.println(shapeArea(5));
    }

    static int shapeArea2(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result += (i - 1) * 4;
        }
        return result;
    }

    static int shapeArea(int n) {
        return IntStream
                .rangeClosed(1, n)
                .map((i -> (i - 1) * 4))
                .sum() + 1;
    }
}
//  1 -> 1 // 0
//  5 -> 2 // 4
// 13 -> 3 // 8
// 25 -> 4 // 12