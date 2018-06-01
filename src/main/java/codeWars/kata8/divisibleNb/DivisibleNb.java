package codeWars.kata8.divisibleNb;

import java.util.stream.Stream;

public class DivisibleNb {

    public static void main(String[] args) {
        System.out.println(isDivisible(3, 1, 3));
        System.out.println(isDivisible(12, 2, 6));
        System.out.println(isDivisible(100, 5, 3));
        System.out.println(isDivisible(12, 7, 5));
    }

    public static Boolean isDivisible(long n, long x, long y) {
//        return Boolean.getBoolean(Stream.of(n)
//                .filter(s -> s % x == 0 && s % y == 0 ? true : false)
//                .toString());
        return n % x == 0 && n % y == 0 ?
                true : false;
    }

}

//Example:
//        isDivisible(3,1,3)--> true because 3 is divisible by 1 and 3
//        isDivisible(12,2,6)--> true because 12 is divisible by 2 and 6
//        isDivisible(100,5,3)--> false because 100 is not divisible by 3
//        isDivisible(12,7,5)--> false because 12 is neither divisible by 7 nor 5
