package codeWars.kata8.sortTextbox;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

    }

    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

//        Collections.sort(textbooks, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.toLowerCase().compareTo(o2.toLowerCase());
//            }
//        });
//        return textbooks;
    }
}
