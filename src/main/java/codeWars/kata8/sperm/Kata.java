package codeWars.kata8.sperm;

public class Kata {

    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XY"));
    }

    public static String chromosomeCheck(String sperm) {
        return sperm.contains("Y") ?
                "Congratulations! You're going to have a son." :
                "Congratulations! You're going to have a daughter.";
    }

}
