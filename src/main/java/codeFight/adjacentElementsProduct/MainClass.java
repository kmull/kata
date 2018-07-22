package codeFight.adjacentElementsProduct;

import java.util.stream.IntStream;

public class MainClass {

    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(theLowest(new int[] {9, 4, 5, 8, 6, 3, 7, 5}));
//        aaa();
    }

    public static int theLowest(int[] inputArray) {

        return IntStream
                .range(0, inputArray.length - 1)
                .map(i -> inputArray[i] * inputArray[i + 1])
                .min()
                .getAsInt();
    }

    static int adjacentElementsProduct(int[] inputArray) {

        return IntStream
                .range(0, inputArray.length - 1)
                .map(i -> inputArray[i] * inputArray[i + 1])
                .max()
                .getAsInt();
    }

    static void aaa() {
        IntStream
                .rangeClosed(0, 10)
                .forEach(System.out::println);
    }

    int adjacentElementsProduct2(int[] inputArray) {
        int result = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            if (result < inputArray[i] * inputArray[i + 1]) {
                result = inputArray[i] * inputArray[i + 1];
            }
        }
        return result;
    }

    int adjacentElementsProduct3(int[] inputArray) {
        return IntStream
                .range(1, inputArray.length)
                .map(i -> inputArray[i] * inputArray[i - 1])
                .max()
                .getAsInt();
    }
}
