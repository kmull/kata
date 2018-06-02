package codeWars.kata8.catYearsDogYears;

public class Dinglemouse {

    public static void main(String[] args) {

    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int[] years = {0, 0, 0};
        if (humanYears >= 1) {
            years[1] = years[1] * 15;
            years[2] = years[2] * 15;
        }
        if (humanYears >= 2) {
            years[1] += 9;
            years[2] += 9;
        }
        if (humanYears > 2) {
            years[1] += (humanYears - 2) * 4;
            years[2] += (humanYears - 2) * 5;
        }
        years[0] = humanYears;

        return years;
    }

}

//    assertArrayEquals(new int[]{1,15,15}, Dinglemouse.humanYearsCatYearsDogYears(1));
//        assertArrayEquals(new int[]{2,24,24}, Dinglemouse.humanYearsCatYearsDogYears(2));
//        assertArrayEquals(new int[]{10,56,64}, Dinglemouse.humanYearsCatYearsDogYears(10));
