public class NumberGenerator implements Runnable {

    @Override
    public void run () {
        // In ra 10 số tự nhiên đầu tiên, cách nhau 500ms
        for (int i = 1; i <= 10; i++) {
            synchronized (this) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " -Number: " + i + " - hashCode: " + this.hashCode());

            }
            try {
                // Dừng vòng lặp trong 500 ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread bị gián đoạn");
            }
        }
    }
}
