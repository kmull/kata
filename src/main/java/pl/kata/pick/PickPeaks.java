package pl.kata.pick;

import java.util.*;

public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        String pos = "pos: ";
        String peaks = "peaks: ";
        System.out.println(Arrays.stream(arr).max().getAsInt());
        int intResult = Arrays.stream(arr).max().getAsInt();
//        int index = Arrays.asList(arr).indexOf(intResult);

        List list = new ArrayList<>();
        list.addAll(Arrays.asList((arr)));

        int index = Arrays.asList(arr).indexOf(intResult);
        System.out.println(index);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(index);
        integerList.add(intResult);

        Map<String, List<Integer>> result = new HashMap<>();
        result.put(pos, integerList);


        return result;
    }

    public static void main(String[] args) {

        System.out.println(getPeaks(new int[]{1, 2, 3, 6, 4, 1, 2, 3, 2, 1}));
    }

}
