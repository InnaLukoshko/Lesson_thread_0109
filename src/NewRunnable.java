public class NewRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();

    }
}
