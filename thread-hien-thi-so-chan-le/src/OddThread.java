public class OddThread extends Thread {
    private Object lock = new Object();

    public OddThread(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("Dãy số lẻ: ");
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}
