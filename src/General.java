public class General {
    public static void main(String[] args) {
//        NewThread t = new NewThread();
//        t.start();
//
//        NewRunnable r1 = new NewRunnable();
//        r1.run();
//        NewRunnable r2 = new NewRunnable();
//        r2.run();
//        NewRunnable r3 = new NewRunnable();
//        r3.run();

        NewThread t1 = new NewThread();
        t1.start();
        NewThread t2 = new NewThread();
        t2.start();
        NewThread t3 = new NewThread();
        t3.start();

    }
}
