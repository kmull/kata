package paczka.pattern.singleton;

public class MainClass {


    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        String something = singleton.setUp("Start");

        System.out.println(something + "----");

        Singleton abc = Singleton.getInstance();
        something = abc.setUp("aaa");
    }

}
