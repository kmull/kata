package paczka.pattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String setUp(String n) {
        System.out.println(n);
        return n;
    }
}
