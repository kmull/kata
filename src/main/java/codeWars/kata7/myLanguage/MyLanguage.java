package codeWars.kata7.myLanguage;

import java.util.*;
import java.util.stream.Collectors;

public class MyLanguage {

    public static void main(String[] args) {

        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);

        for (String a : myLanguages2(map1)) {
            System.out.print(a + " ");
        }
        System.out.println();

        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);

        for (String a : myLanguages2(map2)) {
            System.out.print(a + " ");
        }

    }

    public static List<String> myLanguages(final Map<String, Integer> results) {

        List<Map.Entry<String, Integer>> unSortedList =
                new LinkedList<Map.Entry<String, Integer>>(results.entrySet());

        Collections.sort(unSortedList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });

        List<String> sortedList = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : unSortedList) {

            if (entry.getValue() >= 60) {
                sortedList.add(entry.getKey());
            }
        }
        Collections.reverse(sortedList);
        return sortedList;
    }


    public static List<String> myLanguages2(final Map<String, Integer> results) {

        return results.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 60)
                .sorted(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

//        return results.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() >= 60)
//                .sorted(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed())
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
    }
}
