package old.lambda1;

import java.util.*;

public class MainClass_2 {

    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(8, "Kasia");
        myMap.put(6, "Basia");
        myMap.put(3, "Tomek");
        myMap.put(4, "Wojtek");
        myMap.put(2, "Ilona");
        myMap.put(34, "Andrzej");
        myMap.put(1, "Ramona");

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println("key: " + entry.getKey() +
                    ", value: " + entry.getValue());
        }
        myMap.entrySet().stream()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

    }
}
