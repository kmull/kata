package z.doTestu;

public class Singleton {

    private static Singleton instance = null;

    protected Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
