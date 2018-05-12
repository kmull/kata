package a.tmp.cwiczenia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversTable {
    public static void main(String[] args) {

        Integer[] myArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        List<Integer> listArray = Arrays.asList(myArray);
        Collections.reverse(listArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(listArray.get(i) + " ");
        }
        System.out.println();

        int[] intTab = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] intTabReverse = new int[intTab.length];

        for (int i = 0; i < intTab.length; i++) {
            intTabReverse[i] = intTab[intTab.length - 1 - i];
            System.out.print(intTabReverse[i] + " ");
        }
    }
}
