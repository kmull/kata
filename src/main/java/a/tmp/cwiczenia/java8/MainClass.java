package a.tmp.cwiczenia.java8;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Karol");
        map.put(4, "Wojtek");
        map.put(3, "Tomek");
        map.put(2, "Ania");
        map.put(8, "Michal");
        map.put(7, "Andrzej");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        map.entrySet().stream()
                .filter(x -> x.getKey()%2 == 0)
                .map(x -> x.getValue())
                .forEach(x -> System.out.println(x));
//                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));


    }
}
