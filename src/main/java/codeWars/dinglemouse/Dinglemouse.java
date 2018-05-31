package codeWars.dinglemouse;
/** Sort - one, three, two * */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {
    static Map<String, Integer> myMap = new HashMap<>();
    public static void main(String[] args) {
//    assertArrayEquals(new int[]{4, 1, 3, 2}, Dinglemouse.sort(new int[]{1, 2, 3, 4}));
        sort(new int[]{4, 1, 3, 2});

        for (int intTmp : sort(new int[]{8, 8, 9, 9, 10, 10, 6, 6})) {
            System.out.print(intTmp + " ");
        }
    }

    public static int[] sort(final int array[]) {
        fillMyMap();

        for(int intTmp : array){

        }

        return new int[0];
    }

    private static void fillMyMap() {
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("four", 4);
        myMap.put("five", 5);
        myMap.put("six", 6);
        myMap.put("seven", 7);
        myMap.put("eight", 8);
        myMap.put("nine", 9);
    }

}
