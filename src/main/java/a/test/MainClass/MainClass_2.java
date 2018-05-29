package a.test.MainClass;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass_2 {

    public static void main(String[] args) {


        System.out.println(myMethod(3, 7));
    }

    private static int myMethod(int A, int B) {
        int result = 0;
        Integer binary = IntStream.of(A * B)
                .map(i -> Integer.parseInt(Integer.toBinaryString(i)))
                .sum();

        while (binary>0){
            result += binary%2;
            binary /= 10;
        }

//        int binary = IntStream.of(x)
//                .map(i -> Integer.parseInt(Integer.toBinaryString(x)))

//        System.out.println(binary);

//        int sum = IntStream.of(x)
//                .map(i -> Integer.parseInt(Integer.toBinaryString(x)))
//                .filter(i -> i == 1)
//                .forEach(i-> System.out.println(i));

//        Stream.of(a)
//                .map(Integer::parseInt)

//        System.out.println(Integer.toBinaryString(x));

        return 0;
    }
}
