package a.tmp.cwiczenia.builder1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass2 {

//    static Integer A;
//    static Boolean B;
//    static String C;
//    static Character D;
//
//    static int a;
//    static boolean b;
//    static char c;
//    static float d;

    public static void main(String[] args) {
//        System.out.println(A + "\n" +
//                B + "\n" +
//                C + "\n" +
//                D);
//
//        System.out.println(a + "\n" +
//                b + "\n" +
//                c + "\n" +
//                d);

        int[] tab = {1, 2, 3, 4, 5, 8, 3, 9, 5, 4};
        Arrays.sort(tab);

        for(int tmp : tab) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(tab, 8));
        List list = new ArrayList();
        list.add("Ala");
        list.add(77);
        list.add(false);
        System.out.println(list);
    }

}
