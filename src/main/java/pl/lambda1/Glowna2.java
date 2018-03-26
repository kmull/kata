package pl.lambda1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Glowna2 {
    Glowna2(){
        System.out.println("nic");
    }

    public static void main(String[] args) {
//        Comparator<String> indexComparator = (s1, s2) -> s1.indexOf(s2);
//        Comparator<String> indexReverseComparator = indexComparator.reversed();
//        String string1 = "abcd";
//        String string2 = "abc";
//        System.out.println(indexComparator.compare(string1, string2)); // 1
//        System.out.println(indexComparator.compare(string2, string1)); // 1
//        System.out.println(indexReverseComparator.compare(string1, string2)); // -1

        List<String> myList = new ArrayList<>();
        myList.add("aaa");
        myList.add("bbb");
        myList.add("ddd");
        myList.add("ccc");

        myList.stream()
                .filter(s -> s.contains("a") || s.contains("c") )
                .sorted()
                .map(s -> {
                    s = s.concat(";");
                    s = s+ "c";
                    return s;
                }).filter(s -> s.contains("c"))
                .forEach(System.out::println);
    }
}
