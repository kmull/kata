package wspolbiezne.poczatki.MyThread;

public class MyRunnable implements Runnable {

    int val = 0;

    public void run() {
        synchronized (this) {
            val = val + 1;
            System.out.println(val);
        }
    }

//    public void run(){
//        System.out.println("Runnable started :)");
//    }
}
