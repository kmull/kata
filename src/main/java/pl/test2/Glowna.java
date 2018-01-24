package pl.test2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

public class Glowna {
    public static void main(String[] args) {
        Glowna glowna = new Glowna();

        MathOperation addition = (int a, int b) -> a + b;
        Greetings greetings = (message) ->
                System.out.println("Hello " + message);

        Greetings abc = (kk) ->
                System.out.println("Co masz do powiedzenia " + kk);

        abc.greeting("Robert");
        greetings.greeting("Krzysztof");



        System.out.println
                (glowna.operate(10, 5, addition));
    }

    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    interface Greetings {
        void greeting(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

//}list.forEach(n -> System.out.print(n + " "));


//    public static void main(String[] args) {
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Animal("fish", false, true));
//        animals.add(new Animal("kangaroo", true, false));
//        animals.add(new Animal("rabbit", true, false));
//        animals.add(new Animal("turtle", false, true));
//    }
//}
//print(animals, a -> a.canJump()); // kangaroo rabbit
//        print(animals, a -> a.canSwim()); // fish turtle