package wspolbiezne.poczatki.MyThread;

public class TestClass {
    public static void main(String[] args) {

//        Thread threadA = new Thread(new MyRunnable());
//        Thread threadB = new Thread(new MyRunnable());
//        Thread threadC = new Thread(new MyRunnable());
//
//        threadA.start();
//        threadB.start();
//        threadC.start();

        Runnable runnable = new MyRunnable();
        Thread newThreadA = new Thread(runnable);
        Thread newThreadB = new Thread(runnable);
        Thread newThreadC = new Thread(runnable);

        newThreadA.start();
        newThreadB.start();
        newThreadC.start();
    }
}
