package targipracy.assecoGdynia;

public class Wspolbiezne {
    public static void main(String[] args) {
        Thread newThread = new MyThread();

        newThread.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Witaj w świecie programowania współbieżnego!");
    }
}