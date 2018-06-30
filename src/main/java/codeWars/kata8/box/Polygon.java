package codeWars.kata8.box;

import static java.lang.Math.pow;

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        //Your code comes here
//        return sides < sideLength ? pow(sides / 2, 2) * 3.14 : pow(sideLength / 2, 2) * 3.14;
        return sides < sideLength ? sideLength : sides;
    }

    public static void main(String[] args) {

    }


}
