package codeWars.kata8.stringSpace;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSpace {
    static Boolean a;
    static boolean b;

    static Integer z1;
    static int z2;

    static String s1;
    static String s2 = new String();

    public static void main(String[] args) {
//        System.out.println(noSpace2("No Space   here"));
        System.out.println(a + " " + b);
        System.out.println(z1 + " " + z2);
        System.out.println(s1 + " " + s2);
    }

    static String noSpace(final String x) {
        return Stream.of(x)
                .map(s -> s.replaceAll(" ", ""))
                .collect(Collectors.joining());
    }

    static String noSpace2(final String x) {
        return x.replaceAll(" ", "");
    }


}
