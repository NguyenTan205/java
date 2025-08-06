public class LoadingAnimation implements Runnable {
    private volatile boolean running = true;

    @Override
    public void run() {
        try {
            while (running) {
                System.out.print("\rĐang tải dữ liệu .....");
                Thread.sleep(500);
                System.out.print("\rĐang tải dữ liệu .....");
                Thread.sleep(500);
                System.out.print("\rĐang tải dữ liệu .....");
                Thread.sleep(500);
                System.out.print("\rĐang tải dữ liệu .....");
                Thread.sleep(500);
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void stop() {
        running = false;
    }
}
