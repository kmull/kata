package codeWars.kata8.volume;

public class Volume {

    public static void main(String[] args) {
        for (int x : getSize(10, 10, 10)) {
            System.out.println(x);
        }
    }

    public static int[] getSize(int w, int h, int d) {

        return new int[]{2 * (w * h + w * d + h * d), w * h * d};

    }
}