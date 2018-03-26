package pl.kata.twisted;

import java.util.Arrays;

public class Twisted {
    public static Integer[] sortTwisted37(Integer[] array) {

        Arrays.stream(array).sorted();
        Integer[] newArray = array;

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 3 == 0 && newArray[i] % 6 != 0 && newArray[i] % 9 != 0) {
                newArray[i] = newArray[i] + 4;
            } else if (newArray[i] % 7 == 0) {
                newArray[i] = newArray[i] - 4;
            }
        }
        for(int i = 0; i < newArray.length; i++){
            if (newArray[i] % 3 == 0 && newArray[i] % 6 != 0 && newArray[i] % 9 != 0) {
//                newArray[]
            }

        }
        return newArray;
    }

    public static void main(String[] args) {
        for (int tmp : sortTwisted37(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9})) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        for (int tmp : sortTwisted37(new Integer[] {12,13,14})) {
            System.out.print(tmp + " ");
        }
    }
}
