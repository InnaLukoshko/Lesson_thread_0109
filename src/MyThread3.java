public class MyThread3 extends Thread {
    private StringBuilder stringBuilder;

    public MyThread3(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            stringBuilder = new StringBuilder("a");
            char s0 = stringBuilder.charAt(0);
            s0++;
            System.out.println(s0);
            stringBuilder = new StringBuilder(String.valueOf(s0));
        }
        System.out.println();
    }
}
