package a.tmp.cwiczenia.builder;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public Singleton getInstace() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
