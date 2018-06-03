package targipracy.assecoGdynia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        int[] a = {9, 6, 8, 3, 2, 7, 1};
        Arrays.sort(a);
        for (int tmp : a) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(a, 9));

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.remove(2);
        list.remove(0);

        for (int tmp : list) {
            System.out.println(tmp);
        }

        String ala = "Ala ma kota";
        String[] alaArray = ala.split(" ");
        for (String tmp : alaArray) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        System.out.println(ala.substring(0,3));
        System.out.println(ala.substring(4, 6));
    }

}
