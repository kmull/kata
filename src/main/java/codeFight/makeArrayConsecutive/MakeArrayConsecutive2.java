package codeFight.makeArrayConsecutive;

import java.util.Arrays;

public class MakeArrayConsecutive2 {

    public static void main(String[] args) {
        System.out.println(makeArrayConsecutive2(new int[]{6, 2, 3, 8}));
        System.out.println(makeArrayConsecutive2(new int[]{0, 3}));
    }


    static int makeArrayConsecutive2(int[] statues) {
//        return IntStream
//                .rangeClosed(1, Arrays.stream(statues).max().getAsInt()).;
        return Arrays.stream(statues).max().getAsInt() -
                Arrays.stream(statues).min().getAsInt() -
                (statues.length - 1);
    }
}
