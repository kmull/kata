package pl.kata.HighAndLow;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Kata {

    public static String HighAndLow(String numbers) {
        // Code here or
        IntSummaryStatistics summary = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .summaryStatistics();

        String some = "krzys";
        double ff = 3.3;
//        return summary.getMax() + " " + summary.getMin();
        return String.format("%d %d %s, %.2f", summary.getMax(), summary.getMin(), some, ff);
    }

    public static String HighAndLow2(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return max + " " + min;
    }

    public static String HighAndLow3(String numbers) {
        String[] str = numbers.split(" ");
        Integer[] ints = new Integer[str.length];

        for (int i = 0; i < str.length; i++) {
            ints[i] = Integer.parseInt(str[i]);
        }
        int min = ints[0];
        int max = ints[0];

        for (int i : ints) {
            if (max < i)
                max = i;
            if (min > i)
                min = i;
        }
        return max + " " + min;
    }


    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println("s1==s2 - " + (s1 == s2));
        System.out.println("s1==s3 - " + (s1 == s3));
        System.out.println("s1.equals(s2) - " + s1.equals(s2));
        System.out.println("s1.equals(s3) - " + s1.equals(s3));
//            Map immuMaptableMap

    }
//        String a = HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
//        System.out.println(a);
//
//        String b = HighAndLow2("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
//        System.out.println("\n" + b);
//
//        String c = HighAndLow3("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
//        System.out.println("\n" + c);

//        int a = 5;
//        System.out.println(++a);
//        System.out.println(a);
//
//        System.out.println(a++);
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//
//        String[] abc = {"a", "b", "c"};
//        for(int i =0; i <abc.length; i++){}
//        String nazwa="";
//        for(int i=0; i<nazwa.length(); i++){}
//
//        BigDecimal bigDecimal = BigDecimal.valueOf(-1234567.1234567);
//        System.out.println(bigDecimal.signum());
//        System.out.println(bigDecimal.abs().signum());
//    }
}
