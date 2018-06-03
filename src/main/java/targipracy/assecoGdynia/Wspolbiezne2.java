package targipracy.assecoGdynia;

public class Wspolbiezne2 {
    public static void main(String[] args) {

        //old style
        Runnable r1 = new Runnable() {

            public void run() {
                System.out.println("Start method r1");
            }
        };

        Runnable r2 = () -> System.out.println("Start method r2");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
