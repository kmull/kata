package codeWars.kata8.mathOperations;

public class MathOperations {

    public static void main(String[] args) {
        System.out.println(basicMath("+", 5, 6));
    }

    public static Integer basicMath(String op, int v1, int v2) {
//        int a = Integer.parseInt(op);
//        return v1 + a + v2;

        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
        }
        return 0;
    }
}


//    basicOp('+', 4, 7)         // Output: 11
//    basicOp('-', 15, 18)       // Output: -3
//    basicOp('*', 5, 5)         // Output: 25
//    basicOp('/', 49, 7)        // Output: 7