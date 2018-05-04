package paczka.lambdy;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainClass_2_FunctionInterfaces {

    public static void main(String[] args) {
        /**     Function    */
        Function<String, Integer> toInteger = s -> Integer.valueOf(s);
        Integer myInteger = toInteger.apply("123456a".replaceAll("[^\\d]", ""));
        System.out.println(myInteger);

        Function<Integer, String> toString = integer -> String.valueOf(integer);
        System.out.println(toString.apply(100100100) + ".");

        Function<String, Double> toDouble = integer -> Double.valueOf(integer);
        double myDouble = toDouble.apply("111.222") + toDouble.apply("111.333");
        System.out.println(myDouble);

        Function<String, Integer> stringToInteger = s -> Integer.valueOf(s) * 2;
        Integer secondInteger = stringToInteger.apply("11111");
        System.out.println(secondInteger);
        System.out.println();

        /**     Predicate    */
        Predicate<Double> predicate_1 = aDouble -> aDouble > 222;
        System.out.println(predicate_1.test(myDouble));

        Predicate<Double> predicate_2 = (a) -> a > 777;
        System.out.println(predicate_2.test(myDouble));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test("g"));
        System.out.println();

        /**     Comparator    */
        Comparator<String> indexComparator = (s1, s2) -> s1.indexOf(s2);
        Comparator<String> indexReverseComparator = indexComparator.reversed();

        String string1 = "abcdef";
        String string2 = "cd";

        System.out.println(indexComparator.compare(string1, string2));
        System.out.println(indexReverseComparator.compare(string1, string2));
    }

}
