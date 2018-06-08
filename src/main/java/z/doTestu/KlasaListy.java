package z.doTestu;

import java.util.*;

public class KlasaListy {

    public static void main(String[] args) {

//        String a = "moja ksiazka";
//        String[] stringArray = a.trim().split("");
//        Set set = new HashSet();
//        set.addAll(Arrays.asList(stringArray));
//        System.out.println(stringArray.length + " " + set.size());

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(2, "ja");
        stringMap.put(5, "ty");
        stringMap.put(9, "lol");
        stringMap.put(1, "on");

        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
