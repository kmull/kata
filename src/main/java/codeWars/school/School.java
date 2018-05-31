package codeWars.school;

import java.util.Arrays;

public class School {

    public static void main(String[] args) {

        System.out.println(getAverage(new int[] {1,2,3,4,5}));
    }

    public static int getAverage(int[] marks) {

        return (int)Arrays.stream(marks)
                .average()
                .getAsDouble();
    }

}
